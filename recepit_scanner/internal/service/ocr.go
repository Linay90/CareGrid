package service

import (
	"strings"

	"github.com/otiai10/gosseract/v2"
)

func ExtractMedicines(imagePath string) ([]string, error) {
	client := gosseract.NewClient()
	defer client.Close()

	client.SetImage(imagePath)
	text, err := client.Text()
	if err != nil {
		return nil, err
	}
	lines := strings.Split(text, "\n")
	var medicines []string
	for _, line := range lines {
		line = strings.TrimSpace(line)
		if line != "" && looksLikeMedicine(line) {
			medicines = append(medicines, line)

		}

	}
	return medicines, nil
}

func looksLikeMedicine(line string) bool {
	keywords := []string{"mg", "tablet", "strip", "syrup", "ml"}
	line = strings.ToLower(line)
	for _, keyword := range keywords {
		if strings.Contains(line, keyword) {
			return true
		}
	}
	return false
}
