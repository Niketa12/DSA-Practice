import java.util.Scanner;

public class frequency_count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int hash[]=new int[10];
        while(num!=0){
            int dig=num%10;
            hash[dig]++;
            num=num/10;
        }
        for(int i=0;i<hash.length;i++){
            System.out.println(i + " "+ hash[i]);
        }
    }
    
}
