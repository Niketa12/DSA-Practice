public class sum_digits {
    static void sum_digit(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        int p=num%10;
        sum_digit(num/10, sum+p);
    }
    static int sum_digit(int num){
        if(num==0){
            return 0;
        }
        int p=num % 10 + sum_digit(num/10);
        return p;


    }
    public static void main(String []args){
        sum_digit(1234,0);
        System.out.println(sum_digit(12341));
    }
    
}
