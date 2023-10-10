import java.util.Scanner;

public class DistanceCalculator {
    public static void main (String [] args) {
        Menu a = new Menu();
        a.displayMenu();
        a.input();
        a.result();
    }
}

class Menu {
    Scanner sc = new Scanner(System.in);
    double distance;
    double est;

    public void input() {
        System.out.println("Enter Speed(km/hr): ");
        int speed = sc.nextInt();

        est = distance / speed;
    }

    public void result() {
        System.out.println("EST. Time of Arrival: " + est);
    }
    
    public void displayMenu() {
        System.out.println("Enter your Destination: ");
        
        System.out.println("Route 1 - Mingla");
        System.out.println("Route 2 - San Fernando");
        System.out.println("Route 3 - Carcar");
        
        System.out.println("Is Barili Blocked?");
        System.out.println("[1] - Yes [2] - No");
        int option = sc.nextInt();
        
        if (option == 1) {
            System.out.println("4.2 - Sibonga");
            System.out.println("Is Dumanjug Blocked?");
            System.out.println("[1] - Yes [2] - No");
            int route4 = sc.nextInt();
            if (route4 == 1 ) {
                distance = 92.8;
                
                System.out.println("Ronda");
                System.out.println("Alcantara");
                System.out.println("Moalboal (End)");
                
            } else if (route4 == 2) {
                distance = 89.7;
                System.out.println("4.1.2 - Alcantara");
                System.out.println("Moalboal (End)");
            }    
    } else if (option == 2) {
        distance = 84.4;
        System.out.println("4.1 Barili");
        System.out.println("4.1.1 Dumanjug");
        System.out.println("4.1.2 Alcantara");
        System.out.println("Moalboal (End)");
    }
}
