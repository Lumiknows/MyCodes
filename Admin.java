import java.util.Scanner;
import java.util.ArrayList;

public class Admin extends User {
	int adminID, userID;
	String department, username, email;
    private static Scanner sc = new Scanner (System.in);
    private static ArrayList<Product> product = new ArrayList<>();
    private static boolean firstDisplay = true;
	   
	  Admin(int adminID, String department, int userID, String username, String email) {
      super (userID, username, email);

	    this.adminID = adminID;
	     this.department = department;
         this.userID = userID;
         this.username = username;
         this.email = email;
	   } 
       Admin() {
        if(firstDisplay) {
            defaultProd();
            firstDisplay = false;
        }
    }
   
    private static Product getProduct() {
   
          System.out.println("Product ID: ");
          int productID = sc.nextInt();
		  sc.nextLine();

          System.out.println("Product Name: ");
          String name = sc.nextLine();

          System.out.println("Product Price: ");
          int price = sc.nextInt();

          System.out.println("Product Quantity: ");
          int stockQuantity = sc.nextInt();
          
          return new Product(productID, price, stockQuantity, name);
          

         
   }
	public void addProduct(Product products) {
	    System.out.println("Add a product: ");
        products = getProduct();
        product.add(products);
        System.out.println("Product Added");
        
	   }
	public void removeProduct() {
	      System.out.println("Removing Product...");

		  System.out.println("Product ID:");
		  int productID = sc.nextInt();
	   }
	   
	   void manageInventory() {
	      System.out.println("Managing Inventory...");
	   }
       private void defaultProd() {
            Product p1 = new Product(101, 1000, 100, "Glock-18");
            Product p2 = new Product(202, 3100, 100, "M4A4-s");
            Product p3 = new Product(303, 2700, 100, "AK-47");
            Product p4 = new Product(404, 1400, 100, "MP5");
            Product p5 = new Product(505, 4750, 100, "AWP");

            product.add(p1);
            product.add(p2);
            product.add(p3);
            product.add(p4);
            product.add(p5);

        }
        public void displayMenu() {
           
            System.out.println("======Product List======");
            for ( Product products: product) {
                System.out.println(products);
            }
           
        }
	}