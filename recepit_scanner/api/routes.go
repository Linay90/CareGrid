package api

import (
	"receipt-scanner-service/internal/handler"

	"github.com/gin-gonic/gin"
)

func RegisterRoutes(router *gin.Engine) {
	receiptGroup := router.Group("/api/receipts")
	{
		receiptGroup.POST("/upload", handler.UploadReceipt)
	}

}
