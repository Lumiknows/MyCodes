import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Menu a = new Menu();

        a.input();
        a.displayMenu();
        a.result();
    }
}

class Menu {
    Scanner sc = new Scanner(System.in);
    double speed, distance, eta;

    public void input() {
        System.out.println("Enter Speed(km/hr): ");
        speed = sc.nextDouble();
    }

    public void displayMenu() {

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
            if (route4 == 1) {
                distance = 103.2;

                System.out.println("Route 5   - Argao");
                System.out.println("Route 5.1 - Ronda");
                System.out.println("Route 5.2 - Alcantara");
                System.out.println("Moalboal (End)");

            } else if (route4 == 2) {
                distance = 94.6;
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
        eta = distance / speed * 60;
        int hour = (int) eta / 60;
        int min = (int) eta % 60;
        int sec = (int) ((eta - (int) eta) * 60);
        System.out.print("\nEST. Time of Arrival: \t" + hour + " Hr " + min + " min " + sec + " sec");
        System.out.println("\nTotal Distance: \t" + distance + " KM");
    }
}
