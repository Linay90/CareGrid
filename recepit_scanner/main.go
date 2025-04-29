package main
import(
	"receipt-scanner-service/api"
	"github.com/gin-gonic/gin"
)
func main(){
	router:=gin.Default()
	api.RegisterRoutes(router)
	router.Run(":8080")
}
