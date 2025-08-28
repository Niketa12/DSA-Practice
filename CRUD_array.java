import java.util.Scanner;

public class CRUD_array {
    //instance member
    int arr[];
    int size;
    

    //constructor
    CRUD_array(int capacity){
        int arr[]=new int[capacity];
        size=0;
    }

    void insert(int index,int value){
        arr[index]=value;

    }
    void remove(int value){

    }

    int search(int value){
        return 0;

    }

    boolean update(int oldvalue,int newvalue){
        return true;

    }

    void print(){

    }

    int max(){
        return 0;

    }


    public static void main(String[] args) {
        CRUD_array opr = new CRUD_array(10);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Print");
            System.out.println("6. Max");
            System.out.println("Enter the Choice...");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    opr.insert(8, 100); // Error
                    opr.insert(0, 100); // insert
                    opr.insert(0, 200);
                    opr.insert(1, 8888);
                    break;
                case 2:
                    opr.remove(1000);// not found
                    opr.remove(100); // remove it
                    break;
                case 3:
                    int index = opr.search(200);
                    System.out.println(index >= 0 ? "Found" : "Not Found");
                    break;
                case 4:
                    boolean result = opr.update(200, 2000);
                    System.out.println(result ? "Updated" : "Not Updated");
                    break;
                case 5:
                    opr.print();
                    break;
                case 6:
                    opr.max();
                    break;
                default:
                    System.out.println("Wrong Choice....");

            }
        }
    }
    
}
