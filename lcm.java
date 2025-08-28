import java.util.Scanner;

public class lcm {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int big=Math.max(n1,n2);
        while(true){
            if(big%n1==0 && big%n2==0){
                System.out.println("LCM of "+n1+" and "+n2+" is "+big);
                break;
            }
            big++;
        }
        
    }
    
}
/*
 * int lcm=1;
        for(int i=2;i<=Math.max(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                lcm=i;
            }


        }
        System.out.println(lcm);

 */
