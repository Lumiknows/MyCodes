import java.util.ArrayList;

public class Product {
        int productID, stockQuantity;
        String name, price;
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Product> product = new ArrayList<>();


        Product(int productID, String price, int stockQuantity, String name ) {
            this.productID = productID;
            this.price = price;
            this.stockQuantity = stockQuantity;
            this.name = name;
        }
        Product () {
            
        }

        static void updatePrice() {
            System.out.println("Price updated...");
        }
        
        static void updateStock() {
            System.out.println("Stock updated...");
        }
    }