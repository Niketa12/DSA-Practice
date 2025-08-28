public class basic_prog {
    static void printstar(int star){
        if(star==0){
            return;
        }
        System.out.print("*");
        printstar(star-1);
    }

    static void pattern1(int row){
        if(row==0){
            return;
        }
        pattern1(row-1);
        printstar(row);
        System.out.println();

    }
    public static void main(String[] args){
        pattern1(3);
        //printstar(3-1);//row-1

    }
    
}
