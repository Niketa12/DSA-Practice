import java.util.Scanner;

public class odd_even_sum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int a=num;
        int odd_s=0,even_s=0;
        while(a>0){
            int k=a%10;
            odd_s=odd_s+k;
            a=a/10;
            k=a%10;
            even_s=even_s+k;
            a=a/10;
        }
        System.out.println("Sum of odd position digit: "+odd_s);
        System.out.println("Sum pf even position digit: " + even_s);
        scanner.close();
    }
    
}
