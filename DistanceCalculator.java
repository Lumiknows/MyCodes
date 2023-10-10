import java.util.Scanner;

public class DistanceCalculator {
    public static void main (String [] args) {
        Menu a = new Menu();
        
        a.input();
        a.displayMenu();
        a.result();
    }
}

class Menu {
    Scanner sc = new Scanner(System.in);
    double speed, distance, est;

    public void input() {
        System.out.println("Enter Speed(km/hr): ");
        speed = sc.nextInt();
    }
    public void displayMenu() {
        
        System.out.println("Enter your Destination: ");
        
        System.out.println("Route 1 - Mingla");
        System.out.println("Route 2 - San Fernando");
        System.out.println("Route 3 - Carcar");
        
        System.out.println("Route 4.1 - Barili");
        System.out.println("Is Barili Blocked?");
        System.out.println("[1] - Yes [2] - No");
        int option = sc.nextInt();
        
        if (option == 1) {
            System.out.println("Route 4.2 - Sibonga");
            System.out.println("Is Dumanjug Blocked?");
            System.out.println("[1] - Yes [2] - No");
            int route4 = sc.nextInt();
            if (route4 == 1 ) {
                distance = 95.4;
                
                System.out.println("Route 5   - Argao");
                System.out.println("Route 5.1 - Ronda");
                System.out.println("Route 5.2 - Alcantara");
                System.out.println("Moalboal (End)");
                
            } else if (route4 == 2) {
                distance = 95.1;
                System.out.println("Route 4.2   - Sibonga");
                System.out.println("Route 4.2.1 - Dumanjug");
                System.out.println("Route 4.1.2 - Alcantara");
                System.out.println("Moalboal (End)");
            }    
        } else if (option == 2) {
            distance = 86.1;
            System.out.println("Route 4.1   - Barili");
            System.out.println("Route 4.1.1 - Dumanjug");
            System.out.println("Route 4.1.2 - Alcantara");
            System.out.println("Moalboal (End)");
        }
    }
    
    public void result() {
        est = distance / speed;
        System.out.printf("\nEST. Time of Arrival: \t%.2f HR/S" , est);
        System.out.println("\nTotal Distance: \t" + distance + " KM");
    }
}
