import java.util.Scanner;

public class swap_first_last{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int a=num;
        int i=1;
        while(a!=0){
            a=a/10;
            i=i*10;
        }
        i=i/10;
        int f=num/i;
        int l=num%10;
        int mid=num%i;
        mid=mid/10;
        System.out.println(l*i+mid*10+f);
        scanner.close();
    }
}