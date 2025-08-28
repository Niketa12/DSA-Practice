public class search_replace {
    static String searchandreplace(String str,char search,char replace){
        if(str.length()==0){
            return "";
        }
        String old=searchandreplace(str.substring(1), search, replace);
        if(str.charAt(0)==search){
            return replace+old;
        }
        else return str.charAt(0)+old;
    }
    
    public static void main(String[] args) {
        String r= searchandreplace("Hello", 'l', 'x');
        System.out.println(r);
    }
}
