public class num_english {
    static String num_english(int num,String[] arr){
        if(num==0){
            return "";
        }
        int p=num%10;
        return num_english(num/10, arr)+arr[p];


    }

    public static void main(String[] args) {
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        int num=123;
        System.out.println(num_english(num,arr));
    }
    
}
