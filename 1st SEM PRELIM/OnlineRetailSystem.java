import java.util.Scanner;

public class OnlineRetailSystem {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Welcome to Online Retail System!");
        System.out.println("======Menu======");

        System.out.println("1 - Log in");
        System.out.println("2 - Create an Account");
        int login = sc.nextInt();
        sc.nextLine();

        if (login == 1 || login ==  2) {
            System.out.println("User ID: ");
            int userID = sc.nextInt();
            sc.nextLine();

            System.out.println("Username: ");
            String username = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();

            User x = new User (userID, username, email);
            x.login();
        } else System.out.println("Invalid Input!");

        if (login == 1 || login == 2) {

            while (true) {

            System.out.println("======Menu======");

            System.out.println("1 - Customer");
            System.out.println("2 - Admin");
            System.out.println("3 - Log out");
            int userlogin = sc.nextInt();

                if (userlogin == 1) {
                    System.out.println("Enter Customer ID: ");
                    int customerID = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your Address: ");
                    String address = sc.nextLine();

                    Customer cus = new Customer(customerID, address);

                    System.out.println("Will you Place an Order or View Transaction History?");

                    System.out.println("1 - Place and Order");
                    System.out.println("2 - Log Out");
                    int option = sc.nextInt();

                        if (option == 1) {
                            cus.placeOrder();
                            System.out.println("=======MENU======");

                            Product p1 = new Product(101, "$1000", 100, "Glock-18");
                            Product p2 = new Product(202, "$3100", 100, "M4A4-s");
                            Product p3 = new Product(303, "$2700", 100, "AK-47");
                            Product p4 = new Product(404, "$1400", 100, "MP5");
                            Product p5 = new Product(505, "$4750", 100, "AWP");

                            System.out.println("Product ID: " + p1.productID + " " + "Price: " + p1.price + " " + "Stock: " + p1.stockQuantity + " " + "Name: " + p1.name);
                            System.out.println("Product ID: " + p2.productID + " " + "Price: " + p2.price + " " + "Stock: " + p2.stockQuantity + " " + "Name: " + p2.name);
                            System.out.println("Product ID: " + p3.productID + " " + "Price: " + p3.price + " " + "Stock: " + p3.stockQuantity + " " + "Name: " + p3.name);
                            System.out.println("Product ID: " + p4.productID + " " + "Price: " + p4.price + " " + "Stock: " + p4.stockQuantity + " " + "Name: " + p4.name);
                            System.out.println("Product ID: " + p5.productID + " " + "Price: " + p5.price + " " + "Stock: " + p5.stockQuantity + " " + "Name: " + p5.name);
 
                            
                            Order addProd = new Order();
                            addProd.addProductToOrder();
                            
                                Order ord = new Order();
                                ord.confirmOrder();
                                   
                        } else if (option == 2) {
                            cus.logout();
                            break;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                }
                    else if(userlogin == 2) {
                            System.out.print("Enter Admin ID: ");
                            int adminID = sc.nextInt();
                            sc.nextLine();
                            System.out.print("Enter Department: ");
                            String department = sc.nextLine();

                            Admin add = new Admin(adminID, department);

                            while (true) {
                            System.out.println("Select an Option:");
                            System.out.println("1 - Manage Inventory");
                            System.out.println("2 - Menu");
                            int adminoptions = sc.nextInt();

                            if (adminoptions == 1) {       
                                    add.manageInventory();

                                    System.out.println("=======Menu======");
                                    System.out.println("1 - Add Product");
                                    System.out.println("2 - Remove Product");
                                    System.out.println("3 - Update Price");
                                    System.out.println("4 - Update Stock");
                                    System.out.println("5 - Main Menu");
                                    int addoptions = sc.nextInt();

                                    if (addoptions == 1) {       
                                    add.addProduct();

                                        System.out.println("=======Menu======");
                                        System.out.println("1 - Main Menu");
                                            int option2 = sc.nextInt();
                                                if (option2 == 1) {
                                                break;
                                                } else {
                                                    System.out.println("Invalid Input!");
                                                }
                                    } else if (addoptions == 2) {       
                                    add.removeProduct();

                                        System.out.println("=======Menu======");
                                        System.out.println("1 - Main Menu");
                                            int option3 = sc.nextInt();

                                                if (option3 == 1) {
                                                break;
                                                } else {
                                                    System.out.println("Invalid Input!");
                                                }  
                                        if (option3 == 1) {
                                            break;
                                        } else {
                                            System.out.println("Invalid Input!");
                                        }
                                    } else if (addoptions == 3) {
                                        Product.updatePrice();
                                        } else if (adminoptions == 4) {
                                        Product.updateStock();
                                        } else if (addoptions == 5) {
                                            break;
                                        }
                            } else if (adminoptions == 2) {
                                break;
                            }
                        } 

                    }
                    else if (userlogin == 3) {
                            User out = new User ();
                            out.logout();
                            sc.close();
                            break;
                    } else {
                        System.out.print("Invalid Input!");
                    }
            }              
        }
    }
}


