public class num_table {
    static void printTable(int num,int i){
        if(i==0){    
            return;
        }
        printTable(num, i-1);
        System.out.println(num+" * "+i+" = "+num*i);
        

    }

    static String printTable2(int num,int i){
        
        if(i==11){
            return "";
        }
        
        return (num+" * "+i+" = "+num*i +"\n"+ printTable2(num, i+1));
        //res= ser + printTable2(num, i+1);
    }
    
    public static void main(String[] args) {
        printTable(5,10);
        String r=printTable2(5, 1);
        System.out.println(r);
    }
}
