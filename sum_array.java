public class sum_array {
    static int dosum(int arr[],int index){
        if(index==arr.length){
            return 0;
        }
        int sum=dosum(arr, index+1);
        return arr[index]+sum;

    }
    public static void main(String[] args) {
        int arr[]={1,2,5,10};
        int sum=dosum(arr, 0);
        System.out.println(sum);
        
    }
    
}
