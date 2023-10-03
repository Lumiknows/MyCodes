import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String [] args) {
        ArrayList<String> arr = new ArrayList();
        Items a = new Items();
        
        a.DisplayMenu();
        a.OrderItem();
        
    }
}

public class Items {
    Scanner sc = new Scanner (System.in);
    
    public void DisplayMenu() {
        System.out.println("Menu: ");
        System.out.println("1. C1 - Php 100.00 \n2. C2 - Php 150.00 \n3. C3 - Php 200.00");
    }
    
    public void AddOns() {
        System.out.println("Add Ons: ");
        System.out.println("4. R1 - Php 35.00 \n5. R2 - Php 50.00");
    }
    
    public void OrderItem() {
        int item = sc.nextInt();
        
        if (item == 1) {

        } else if (item == 2) {
            
        } else if (item == 3) {
            
        } else {
            System.out.println("Invalid Input");
        }
    }
}
