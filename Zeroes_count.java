public class Zeroes_count {

    static void Zeroes_count(int num,int count){
        if(num==0){System.out.println("count of zeeroes are  "+count);
            return;
        }
        if(num%10==0){
            count++;
        }
        Zeroes_count(num/10, count);
    }
    static int Zeroes_count(int num){
        if (num==0){
            return 0;
        }
        if(num%10==0){
            return 1+Zeroes_count(num/10);
        }
        return Zeroes_count(num/10);
        
    }
    public static void main(String[] args) {
        int num=1010;
        Zeroes_count(num,0); 
        System.out.println("Count of Zeroes are "+Zeroes_count(num));

    }
    
}
