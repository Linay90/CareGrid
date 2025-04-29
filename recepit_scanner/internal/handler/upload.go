package handler

import (
	"net/http"

	"receipt-scanner-service/internal/service"
	"receipt-scanner-service/internal/utils"

	"github.com/gin-gonic/gin"
)

func UploadReceipt(c *gin.Context) {
	file, err := c.FormFile("receipt")
	if err != nil {
		c.JSON(http.StatusBadRequest, gin.H{"error": "File upload error"})
		return
	}

	savePath := "./temp/" + file.Filename
	if err := c.SaveUploadedFile(file, savePath); err != nil {
		c.JSON(http.StatusInternalServerError, gin.H{"error": "coild not save file"})
		return

	}

	medicines, err := service.ExtractMedicines(savePath)
	if err != nil {
		c.JSON(http.StatusInternalServerError, gin.H{"error": "ocr processing failed"})
		return
	}

	utils.DeleteFile(savePath)
	c.JSON(http.StatusOK, gin.H{
		"medicines": medicines,
	})

}
