import java.util.Scanner;

public class Admin extends User {
	   int adminID, userID;
	   String department, username, email;
       Scanner sc = new Scanner (System.in);
	   
	   Admin(int adminID, String department, int userID, String username, String email) {
       super (userID, username, email);

	      this.adminID = adminID;
	      this.department = department;
          this.userID = userID;
          this.username = username;
          this.email = email;
	   }
	   
	   public Admin(int adminID2, String department2) {
	}

	void addProduct() {
	      System.out.println("Adding Product...");

          System.out.println("Product Name: ");
          String productName = sc.nextLine();

          System.out.println("Product ID: ");
          int productID = sc.nextInt();

          System.out.println("Product Price: ");
          int productPrice = sc.nextInt();

          System.out.println("Product Quantity: ");
          int productQuan = sc.nextInt();

	   }
	   void removeProduct() {
	      System.out.println("Removing Product...");

		  System.out.println("Product ID:");
		  int productID = sc.nextInt();

		  System.out.println("Product Price: ");
          int productPrice = sc.nextInt();

          System.out.println("Product Quantity: ");
          int productQuan = sc.nextInt();
	   }
	   
	   void manageInventory() {
	      System.out.println("Managing Inventory...");
	   }
	}
	