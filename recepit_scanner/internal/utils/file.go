package utils

import (
	"os"
)

func DeleteFile(filePath string) {
	os.Remove(filePath)
}
