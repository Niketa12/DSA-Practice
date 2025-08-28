public class pallindrome {
    /*
     * 1..static boolean ispallindrome(int num,int org,int reverse){
        if(num==0){
        return org==reverse;
        }
        int p=num%10;
        reverse=reverse*10+digit;
        ispallindrome(num/10,org,reverse)
        
    }
     */


    /*2..static boolean ispallindrome(int num,int org,int reverse){
        
        while(num!=0){
            int p=num%10;
            reverse=reverse*10+p;
            num=num/10;

        }
        if(reverse==org){
            return true;
        }
        return false;
    }*/


    /*3..static int pallindrome(int num){//return reverse
        int reverse=0;
        while(num!=0){
            int p=num%10;
            reverse=reverse*10+p;
            num=num/10;
        }
        return reverse;

    }
    */
    /*4..static int reverse=0;
    static int pallindrome(int num){//return reverse
        if(num==0){
            return reverse;
        }
        else{
            int p=num%10;
            reverse=reverse*10+p;
            pallindrome(num/10);
            return reverse;

        }
    }
        */

    static int pallindrome(int num){
        return pallindrome(num,0);//Helper function
    }

    static int pallindrome(int num,int rev){
        int p=num%10;
        rev=rev*10+p;
        return pallindrome(num/10,rev);
    }

        









    public static void main(String[] args){
        //boolean result= ispallindrome(151,152,0);
        //System.out.println(result ? "pallindrome" : "Not");
        int num=151;
        int reverse=pallindrome(num);
        if(num==reverse){
            System.out.println("Yes Given num is pallindrome");
        }
        else{
            System.out.println("Not a pallindrome");
        }

    }
    
}
