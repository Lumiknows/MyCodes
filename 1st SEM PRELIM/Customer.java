import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Customer extends User {
        int customerID;
        int orderID = 22640353;
        String address;
        Date orderDate;
        ArrayList<String> products = new ArrayList<>();
        Scanner sc = new Scanner (System.in);

        Customer(int customerID, String address) {
            this.customerID = customerID;
            this.address = address;
        }
        Customer () {

        }

        void placeOrder() {
            System.out.println("Placing Order...");
        }
        
        void viewOrderHistory() {
            System.out.println("Viewing Order History...");
            System.out.println("=======Transaction History=======");

            for (String productList : Order.products) {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
                String formattedDate = myDateObj.format(myFormatObj);

                System.out.println(orderID + "\t" + productList + "       \t " + formattedDate );
            }
            System.out.println("======Menu======");
            System.out.println("1 - Menu");
            int yesno = sc.nextInt();
                if (yesno == 1) {     
                } 
        }
    }