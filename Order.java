import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Order {
        int orderID =22640353, customerID, totalAmount;
        static int amount = 0;
        static ArrayList<String> products = new ArrayList<>();
        Date orderDate;
        Scanner sc = new Scanner (System.in);

        Order(int orderID, int customerID, int totalAmount, String products, Date orderDate) {
            this.orderID = orderID;
            this.customerID = customerID;
            this.totalAmount = totalAmount;
            this.orderDate = new Date();
        }
        Order () {

        }

        void addProductToOrder() {
            while (true) {
                System.out.println("What product do you wish to order? (Input Product ID): ");
                int getOrder = sc.nextInt(); 

                if (getOrder == 101) {
                    products.add("Glock-18");
                    amount += 1000;
                    System.out.println("Added: Glock-18 (Product ID: 101)");
                } else if (getOrder == 202) {
                    products.add("M4A4-S");
                    amount += 3100;
                    System.out.println("Added: M4A4-S  (Product ID: 202)");
                } else if (getOrder == 303) {
                    products.add("AK-47");
                    amount += 2700;
                    System.out.println("Added: AK-47 (Product ID: 303)");
                } else if (getOrder == 404) {
                    products.add("MP5");
                    amount += 1500;
                    System.out.println("Added: MP5 (Product ID: 404)");
                } else if (getOrder == 505) {
                    products.add("AWP");
                    amount += 4750;
                    System.out.println("Added: AWP (Product ID: 505)");
                } else if (getOrder == 0) {
                    break;
                } else {
                    System.out.println("Invalid Input!");
                }
                System.out.println("If you're done with your purchase type 0");
            }
        }

        void calculateTotalAmount(){
            System.out.println("Total Amount Calculated" );
        }
        
        void confirmOrder() {
            
            System.out.println("1 - Confirm Order");

            int option1 = sc.nextInt();

            if (option1 == 1) {
                System.out.println("=======Ordered Products=======");
                for (String productList : products) {
                System.out.println(productList); 
                }
            int totalAmount = amount;     
            System.out.println("Order ID: " + orderID + "\nTotal Cost: " + totalAmount );

            System.out.println("1 - View Order History");
            System.out.println("2 - Exit to Main Menu");
            int view = sc.nextInt();
            
                if (view == 1) {
                
                Customer viewHist = new Customer ();
                viewHist.viewOrderHistory();

                }
                //     else if ( option == 2) {
                //        break;
                //    } 
                
            }  
        }
    }