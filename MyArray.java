import java.util.Scanner;

class Array {
        Scanner sc = new Scanner(System.in);
        private int arr[];
        
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
    
        public Array(int length) { arr = new int [length]; }
        
        public void add() {
        
        System.out.println("Enter an element: ");
        int addNum = sc.nextInt();
        
          if (arr.length == size) {
             for (int i = 0; i < size; i++) {
                System.out.println(addNum " was Added");
          }
          
          arr[size++] = element;  
        }
        public void view() {
        
          for (int i = 0; i < size; i++) {
             System.out.println(arr[i] + " ");
          }
            
        }
        public void remove() {
            
        }
        public void search() {
            
        }
        public void sort() {
            
        }
        public void edit() {
            
        }
        public void exit() {
            
        }
        public void getSize() {
            System.out.println("Enter Array Size: ");
            int size = sc.nextInt();
        }
    }
}
class Main {
        public static void main(String[] args) {
            Array newArray = new Array ();
            
            newArray.getSize();
        
            System.out.println("1 - Add     2 - View");
            System.out.println("3 - Remove  3 - Search");
            System.out.println("4 - Sort    5 - Edit");
            System.out.println("7 - Exit");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    newArray.add();
                    break;
                case 2:
                    newArray.view();
                    break;
                case 3:
                    newArray.remove();
                    break;
                case 4:
                    newArray.search();
                    break;
                case 5:
                    newArray.sort();
                    break;
                case 6:
                    newArray.edit();
                    break;
                case 7:
                    newArray.exit();
                    break;
            }
    }
}
