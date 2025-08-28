import java.util.Scanner;

public class perfect_nuber {//multiples  sum=num
    public static void main(String []args){

        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int s=0;
        for(int i=1;i<num;i++){//use num/2 to reduce iteration
            if (num%i==0){
                s=s+i;
            }
        }
        if(s==num){
            System.out.println(num +" is perfect Number");
        }
        else {
            System.out.println(num +" is not perfect Number");
        }
        scanner.close();

    }
}
