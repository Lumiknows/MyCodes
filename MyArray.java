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

    boolean isFull() { 
        return ctr >= size;
    }
    boolean isEmpty() { 
        return ctr == 0;
    }

public void add() {
    while (true) {
        if (isFull()) {
            System.out.println("Array is Full!");
            System.out.println("Do you Want to Resize your Array?");
            System.out.println("1 - Yes     2 - No");
            int option = sc.nextInt();

            if (option == 1) {
                arraySize();
            } else if (option == 2) {
                return;
            } else {
                System.out.println("Invalid Input!");
            }
        } else {
            System.out.println("Enter Value to Add: ");
            int val = sc.nextInt();

            arr[++idx] = val;
            ctr++;
            
            System.out.println("Do you want to add another Value?");
            System.out.println("1 - Yes     2 - No");
            int opt = sc.nextInt();

            if (opt != 1) {
                return;
            }
        }
    }
}

    public void view () {

        if (isEmpty()) {
            System.out.println("Array is Empty!");
        }
        
        for(int i = 0; i < ctr; i++) {

            System.out.print("[" + arr[i] + "] ");
        }
            System.out.println("\n\nCurrent Array Size: [" + ctr + "]");
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
                for (int i = remIdx; i < ctr - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                ctr--;
                idx--;
                System.out.println("Index: " + remIdx + " was removed!");
            }
        }
    }

    public void search () {

        if (isEmpty()) {
            System.out.println("Array is Empty!");
        } else {
            System.out.println("Enter the Value to Search: ");
            int scanIdx = sc.nextInt();

            int [] idxList = new int[ctr];
            int ctrList = 0;
            boolean found = false;

            for (int i = 0; i < ctr; i++) {
                if (arr[i] == scanIdx) {
                    idxList[ctrList++] = i;
                    found = true;
                }
            }
            if (found) {
                System.out.print("Value: " + scanIdx + " found at Index/es: ");
                for (int x = 0; x < ctrList; x++) {
                    System.out.print("[" + idxList[x] + "] ");
                }
                System.out.println(" ");
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

            System.out.println("Choose an Option: ");
            System.out.println("1 - Ascending   2 - Descending");
            int option = sc.nextInt();

            if (option == 1) {
                for (int i = 0; i < ctr - 1; i++) {
                    for (int a = 0; a < ctr - i - 1; a++) {
                        if (arr[a] > arr [a + 1]) {
                            int temp = arr[a];
                            arr[a] = arr[a + 1];
                            arr[a + 1] = temp;
                        }
                    }
                }
                System.out.println("Array was sorted in [Ascending] Order successfully!");
            } else if (option == 2) {
                for (int i = 0; i < ctr - 1; i++) {
                    for (int a = 0; a < ctr - i - 1; a++) {
                        if (arr[a] < arr[a + 1]) {
                            int temp = arr[a];
                            arr[a] = arr[a + 1];
                            arr[a + 1] = temp;
                        }
                    }
                }  
                System.out.println("Array was sorted in [Descending] Order successfully!");
            } else {
                System.out.println("Invalid Input!");
            }
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
                System.out.println("Enter new Value for Index:  [" + editIdx + "]");
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

            System.out.println(" ");
            System.out.println("[1] - Add     [2] - View");
            System.out.println("[3] - Remove  [4] - Search");
            System.out.println("[5] - Sort    [6] - Edit");
            System.out.println("[7] - Exit   ");
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
                a.exit();
                break;
            }
        }

    }
}
