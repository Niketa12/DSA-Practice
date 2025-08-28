public class prime {
    static void prime_num(int num,int org,int flag){
        if(num==1){
            if(flag==0){
                System.out.println(org+" is Prime Number");
            }
            else System.out.println(org+" is not a  Prime Number");
            return;
        }
        if(org%num==0){
            flag++;
        } 
        prime_num(num-1, org, flag);   
    }
    static int prime_num(int num,int org){
        if(num==1){
            return 0;
        }
        if(org %num==0){
            return 1 + prime_num(num-1,org);
        } 
        return prime_num(num-1,org);
        
        

    }
        


    
    public static void main(String[] args){
        int num=93;
        prime_num(num-1,num,0);
        
        int res=prime_num(num-1,num);
        if(res==0){
            System.out.println(num+" is Prime Number");
        }
        else System.out.println(num +" is not a Prime Number");
    }
    
}
