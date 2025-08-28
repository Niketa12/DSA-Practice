public class reversestring {
    static String reverse(String name){
        if(name.length()==0){
            return "";
        }
        String result=reverse(name.substring(1))+name.charAt(0);
        return result;


    }
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }
    
}
