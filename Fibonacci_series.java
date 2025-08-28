import java.util.Scanner;

public class Fibonacci_series {
    static int fib(int n){// so that no need to make object
        if(n==1 || n==2){
            return(n-1);
        }
        else return(fib(n-1)+fib(n-2));
    }
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        
        int ser=fib(num);
        System.out.println(ser);
        scanner.close();
    }
    
    
}
