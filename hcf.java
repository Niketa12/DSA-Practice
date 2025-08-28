import java.util.Scanner;

public class hcf {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int hcf=1;
        for(int i=2;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);
        
    }
    
}
