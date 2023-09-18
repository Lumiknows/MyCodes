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

            System.out.println("======Main Menu======");

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
                            System.out.println("=======MENU======");
                            cus.placeOrder();
                                   
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

                            Admin add = new Admin();
                            Product products = new Product();

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
                                        add.addProduct(products);

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
                            break;
                    } else {
                        System.out.print("Invalid Input!");
                    }
            }              
        }
    }
}

