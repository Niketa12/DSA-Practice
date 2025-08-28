import java.util.Scanner;

public class swap_dig_pos{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int digit =scanner.nextInt();
        int num=digit;
        int dig=num;
        int l=0;
        int res=0;
        while(num!=0){
            num=num/10;
            l++;
        }
        for(int i=1;i<=l;i++){
            int last=dig%10;
            dig=dig/10;

            res=res+i*(int)Math.pow(10,last-1);
        }
        System.out.println(res);

        scanner.close();
    }
}