import java.util.Scanner;

public class MyArray {
    int [] arr;
    int size, idx, ctr;
    static Scanner sc = new Scanner(System.in);

    public MyArray(int s) {
        size = s;
        arr = new int[size];
        idx = -1;
        ctr = 0;
    }

    boolean isFull() { return ctr >= size;}
    boolean isEmpty() { return ctr == 0;}

    public void add() {
        while(!isFull()) {
            System.out.println("Enter Value to Add: ");
            int val = sc.nextInt();
            if (isFull()) {
                System.out.println("Array is Full!");
            }
            arr[++idx] = val;
            ctr++;
        }
        if (isFull()) {
            System.out.println("Array is Full!");
        }
    }

    public void view () {
        for(int i = 0; i < ctr; i++) {
            System.out.println("[ " + arr[i] + " ]");
        }
    }

    public void count() {
        System.out.println("Current Array Size " + ctr);
    }

    public void remove () {

        if (isEmpty()) {
            System.out.println("Array is Empty!");
        } else {
            System.out.println("Enter the Index to Remove");
            int remIdx = sc.nextInt();

            if (remIdx < 0 || remIdx >= ctr) {
                System.out.println("Invalid Index Number!");
            } else {
                for (int i = remIdx; i < ctr - 1; i ++) {
                    arr[i] = arr[i +1];
                }
                ctr--;
                System.out.println("Index " + remIdx + " was removed!");
            }
        }

    }

    public void search () {

        if (isEmpty()) {
            System.out.println("Array is Empty!");
        } else {
            System.out.println("Enter the Index to Search: ");
            int scanIdx = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < ctr; i++) {
                if (arr[i] == scanIdx) {
                    System.out.println("Value: " + scanIdx + " Index: " + i);
                    found = true;
                    break;
                }
            }

            if(!found) {
                System.out.println("Value: " + scanIdx + " was not found!");
            }
        }

    }

    public void sort () {
        if (isEmpty()) {
            System.out.println("Array is Empty!");
        } else {
            for (int i = 0; i < ctr - 1; i++) {
                for (int a = 0; a < ctr - i - 1; a++) {
                    if (arr[a] > arr [a + 1]) {
                        int temp = arr[a];
                        arr[a] = arr[a +1];
                        arr[a + 1] = temp;
                    }
                }
            }

            System.out.println("Array was sorted successfully!");
        }

    }

    public void edit () {

        if (isEmpty()) {
            System.out.println("Array is Empty!");
        } else {
            System.out.println("Enter Index to Edit: ");
            int editIdx = sc.nextInt();

            if (editIdx < 0 || editIdx >= ctr) {
                System.out.println("Invalid Index!");
            } else {
                System.out.println("Enter new Value for:  [" + editIdx + "]");
                int newVal = sc.nextInt();
                
                arr[editIdx] = newVal;
                System.out.println("Element at index " + editIdx + " was changed to " + newVal);
            }
        }

    }

    public void arraySize () {

        System.out.println("Enter New Array Size: ");
        int newSize = sc.nextInt();

        if (newSize < ctr) {
            System.out.println("Unable to Resize to a Smaller Size than the Current Number of Elements!");
        } else {
            int [] newArray = new int[newSize];
            System.arraycopy(arr, 0, newArray, 0, ctr);
            arr = newArray;
            size = newSize;
        }
    }

    public void exit () {

        System.out.println("Sucessfully Exited the Program!");
        System.exit(0);

    }

    public static void main (String [] args) {

        System.out.println("Enter Array Size: ");
        int initSize = sc.nextInt();
        MyArray a = new MyArray(initSize);;

        while (true) {

            System.out.println("1 - Add     2 - View");
            System.out.println("3 - Remove  4 - Search");
            System.out.println("5 - Sort    6 - Edit");
            System.out.println("7 - Count   8 - Resize");
            System.out.println("9 - Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                a.add();
                break;
            case 2:
                a.view();
                break;
            case 3:
                a.remove();
                break;
            case 4:
                a.search();
                break;
            case 5:
                a.sort();
                break;
            case 6:
                a.edit();
                break;
            case 7:
                a.count();
                break;
            case 8:
                a.arraySize();
                break;
            case 9:
                a.exit();
                break;
            }
        }

    }
}
