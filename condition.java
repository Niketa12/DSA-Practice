import java.util.Scanner;

public class condition{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is Greatest");
            }
            else System.out.println("c is Greatest");
        }
        else {
            if(b>c) System.out.println("b is Greatest");
            else System.out.println("c is Greatest");
        }
    }
}