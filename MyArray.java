import java.util.Scanner;

public class MyArray {
    int [] arr;
    int size, idx, ctr;
    static Scanner sc = new Scanner(System.in);

    //My Array Constructor//
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
            try {
                if (isFull()) {
                    System.out.println("Array is Full!");
                    System.out.println("Do you Want to Resize your Array?");
                    System.out.println("1 - Yes     2 - No");
                    int option = Integer.parseInt(sc.nextLine());
    
                    if (option == 1) {
                        arraySize();
                    } else if (option == 2) {
                        return;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                } else {
                    while (true) {
                        System.out.println("Enter Value to Add: ");
                        String input = sc.nextLine();
    
                        try {
                            int val = Integer.parseInt(input);
                            arr[++idx] = val;
                            ctr++;
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid Input! Please Enter an Integer Value");
                        }
                    }
                }
    
                while (true) {
                    System.out.println("Do you want to add another Value?");
                    System.out.println("1 - Yes     2 - No");
                    String input = sc.nextLine();
    
                    try {
                        int opt = Integer.parseInt(input);
    
                        if (opt == 1 || opt == 2) {
                            if (opt == 2) {
                                return;
                            }
                            break;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid Input! Please Enter an Integer Value");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please Enter an Integer Value");
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

    public void remove() {
        while (true) {
            try {
                if (isEmpty()) {
                    System.out.println("Array is Empty!");
                    return;
                } else {
                    System.out.println("Enter the Index to Remove");
                    int remIdx = sc.nextInt();
    
                    if (remIdx < 0 || remIdx >= ctr) {
                        System.out.println("Invalid Index Number!");
                    } else if (arr[remIdx] == 0) {
                        System.out.println("Element has no value!");
                    } else {
                        arr[remIdx] = 0;
                        System.out.println("Index: " + remIdx + " was removed!");
    
                        while (true) {
                            System.out.println("Do you want to remove another value?");
                            System.out.println("1 - Yes     2 - No");
                            int choice;
                            try {
                                choice = sc.nextInt();
                            } catch (Exception e) {
                                System.out.println("Invalid Input! Please Enter an Integer Value");
                                sc.nextLine();
                                continue;
                            }
    
                            if (choice == 1) {
                                break;
                            } else if (choice == 2) {
                                return;
                            } else {
                                System.out.println("Invalid Input. Enter the Correct Choice!");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please Enter an Integer Value");
                sc.nextLine();
            }
        }
    }

    public void search () {

        while (true) {
            try {
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
                        while (true) {
                            System.out.println("Do you want to search another value?");
                            System.out.println("1 - Yes     2 - No");
                            int choice;
                            try {
                                choice = sc.nextInt();
                            } catch (Exception e) {
                                System.out.println("Invalid Input! Please Enter an Integer Value");
                                sc.nextLine();
                                continue;
                            }
                            if (choice == 1) {
                                break;
                            } else if (choice == 2) {
                                return;
                            } else {
                                System.out.println("Invalid Input. Enter the Correct Choice!");
                            }
                        }
                    }
                    if(!found) {
                        System.out.println("Value: " + scanIdx + " was not found!");
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please Enter an Integer Value");
                sc.nextLine();
            }
        }
    }

    public void sort () {
        if (isEmpty()) {
            System.out.println("Array is Empty!");
        } else {
            while (true) {
                try {
                    System.out.println("Choose an Option: ");
                    System.out.println("1 - Ascending   2 - Descending  3 - Menu");
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
                    } else if (option == 3) {
                        return;
                    } else {
                        System.out.println("Invalid Input!");
                    }
                    for(int i = 0; i < ctr; i++) {

                        System.out.print("[" + arr[i] + "] ");
                    }
            System.out.println("\n\nCurrent Array Size: [" + ctr + "]");
                } catch (Exception e) {
                    System.out.println("Invalid Input! Please Enter an Integer Value");
                    sc.nextLine();
                }
            }
        }
    }
    public void edit() {
        while (true) {
            try {
                if (isEmpty()) {
                    System.out.println("Array is Empty!");
                } else {
                    System.out.println("Enter Index to Edit: ");
                    int editIdx = sc.nextInt();
            
                    if (editIdx < 0 || editIdx >= ctr) {
                        System.out.println("Invalid Index!");
                    } else {
                        while (true) {
                            try {
                                System.out.println("Enter new Value for Index:  [" + editIdx + "]");
                                int newVal = sc.nextInt();
                    
                                arr[editIdx] = newVal;
                                System.out.println("Element at index " + editIdx + " was changed to " + newVal);
                                return;
                            } catch (Exception e) {
                                System.out.println("Invalid Input! Please Enter an Integer Value");
                                sc.nextLine();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid Input! Please Enter an Integer Value");
                sc.nextLine();
            }
        }
    }
    
    public void arraySize () {

        System.out.println("Enter New Array Size: ");
        int newSize = sc.nextInt();
      
        if (newSize <= ctr) {
          System.out.println("Unable to Resize to a Smaller/Simalar Size than the Current Number of Elements!");
          return;
        } else {
          int [] newArray = new int[newSize];
      
          for (int i = 0; i < ctr; i++) {
              newArray[i] = arr [i];
          }
          arr = newArray;
          size = newSize;
        }
    }

    public void exit () {

        System.out.println("Sucessfully Exited the Program!");
        System.exit(0);

    }

    public static void main(String[] args) {
        int initSize = 0;
    
        while (true) {
            try {
                System.out.println("Enter Array Size: ");
                initSize = sc.nextInt();
                sc.nextLine(); 
                break; 
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); 
            }
        }
    
        MyArray a = new MyArray(initSize);
    
        while (true) {
            try {
                System.out.println(" ");
                System.out.println("[1] - Add     [2] - View");
                System.out.println("[3] - Remove  [4] - Search");
                System.out.println("[5] - Sort    [6] - Edit");
                System.out.println("[7] - Exit   ");
                int choice = sc.nextInt();
                sc.nextLine();
    
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
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.nextLine(); 
            }
        }
    }    
}
