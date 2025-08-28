public class Evenodd {
    /*static void countEvenOdd(int n,int even,int odd){
        if(n==0){
            System.out.println("Even: "+even);
            System.out.println("Odd: "+odd);
            return;
        }
        
        if(n%2==0) even++;
        else odd++;
        countEvenOdd(n-1, even, odd);
        
        
    }*/
    static int[] countEvenOdd(int n){
        if(n==0){
            int arr[]=new int[2];   //base case ke andar ek bar hoga and out of base many time hoga
            return arr;
        }
        
        int arr[]=countEvenOdd(n-1);
        if(n%2==0) arr[0]++;
        else arr[1]++;
        return arr;
    }


    public static void main(String[] args) {
        //countEvenOdd(100, 0, 0);
        int[] res=countEvenOdd(100);
        
        System.out.println(res[0]);
    }
    
}
