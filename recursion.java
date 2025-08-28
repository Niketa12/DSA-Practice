import java.util.Scanner;

public class recursion{
    /*static void show(int n){
        if(n==0){
            return;
        }
        System.out.println("Niketa");//pre-logic
        
        show(n-1);//recursion relation
        //post-logic-BackTracking
        
    }*/

    static void fact(int num,int res){
        if(num==0){
            System.out.println(res);
            return;
        }
        fact(num-1,res*num);
    }
    static int fact(int num){
        if (num==1) return 1;
        int res=num;
        res=res*fact(num-1);
        return res;
        /*
         * int res=fact(n-1);
         * return res*num;
         */
    }

    
    public static void main(String[] args) {
        //show(5);
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int res=fact(num);
        System.out.println(res);
        //fact(num,1);
        scanner.close();
    }
}