public class sum_natural {
    static void sum_natural(int num,int sum){
        if(num==0){
            System.out.println(sum);
            return;
        }
        --num;
        sum=sum+num;
        sum_natural(num, sum);
        
    }

    static int  sum_natural(int num){
        if(num==0){
            return 0;
        }
        --num;
        int sum=sum_natural(num);
        sum=sum+num;
        return sum;


    }
    public static void main(String[]args){
        sum_natural(9,0);
        System.out.println(sum_natural(9));

    }
    
}
