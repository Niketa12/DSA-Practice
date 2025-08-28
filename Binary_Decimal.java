public class Binary_Decimal {
    static void binary_decimal(int num,int decimal,int p){
        if(num==0){
            System.out.println(decimal);
            return;
        }
        int dig=num%10;
        
        decimal=decimal+(int)Math.pow(2, p)*dig;
        binary_decimal(num/10,decimal,++p);
    }
    static int binary_decimal(int num,int p){
        if(num==0){
            return p;
        }
        return 0;

    }
    public static void main(String[] args){
        int num=111;
        binary_decimal(num,0,0);

    }
    
}
