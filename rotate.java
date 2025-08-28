import java.util.Scanner;

/*public class rotate {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int rotate=scanner.nextInt();
        int a=num;
        int dig=1;
        int l=0;
        while(a!=0){
                a=a/10;
                l++;
                dig=dig*10;
            }
        dig=dig/10;
        for(int i=1;i<=rotate;i++){
            int last_dig=num%10;
            num=num/10;
            int res=last_dig*(int)Math.pow(10,l-1)+num;
        }
        System.out.println(int res);
        scanner.close();
    }
    
}

12345

divide num is123 and 45
them sap them
right=num/10pow r
left=num%10pow r
*/

public class rotate{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int pos=scanner.nextInt();
        int right=0;
        int left=num % Math.pow(10,pos);
        System.out.println(left);
    }
}