public class dice_path {
    static int n_ways(int num,int ways){
        if(num==0){
            return 0;
        }
        if(num<0){
            return -1;
        }
        int option1=n_ways(num-1,ways);
        if(option1==0)  ways=ways+1;
        int option2=n_ways(num-2,ways);
        if(option1==0)  ways=ways+1;
        int option3=n_ways(num-3,ways);
        if(option1==0)  ways=ways+1;
        int option4=n_ways(num-4,ways);
        if(option1==0)  ways=ways+1;
        int option5=n_ways(num-5,ways);
        if(option1==0)  ways=ways+1;
        int option6=n_ways(num-6,ways);
        if(option1==0)  ways=ways+1;
        //int result =Math.max(option1,Math.max(option2,Math.max(option3,Math.max(option4,Math.max(option5,option6)))));  // bcs can give maximum from two terms
        //if(result==-1){
            //return -1;

        //}
        return ways;

    }

    public static void main(String[] args) {
        System.out.println(n_ways(3,0));
        
    }
}