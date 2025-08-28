public class Max_array {
    static int max(int arr[],int index){
        if(index==arr.length){
            return 0;     //for negative
        }
        int m=max(arr,index+1);
        if(arr[index]>m) {
            m=arr[index];
        }
        return m;
    }
    public static void main(String[] args){
        int arr[]={9,10,8,6,50,88,66};
        int r=max(arr,0);
        System.out.println("Max is "+ r);

    }
    
}
