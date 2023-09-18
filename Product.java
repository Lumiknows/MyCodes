public class Product {
        private int productID;
        private int price;
        private int stockQuantity;
        private String name;

        Product(int productID, int price, int stockQuantity, String name ) {
            this.productID = productID;
            this.price = price;
            this.stockQuantity = stockQuantity;
            this.name = name;
        }
        Product () {
            
        }
        public String toString() {
            return "ProductID: " + productID + " , Name: " + name + ", Price: " + price + ", Stock Quantity: " + stockQuantity + "";
        }

        static void updatePrice() {
            System.out.println("Price updated...");
        }
        
        static void updateStock() {
            System.out.println("Stock updated...");
        }
    }