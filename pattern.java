public class pattern {  //left to right an top to bottom
    static void pattern1(){
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");//print to print in same line...only print
            }
            System.out.println();//for newline  ...print with nextline
        }
        System.out.println();
        System.out.println();

    }



    static void pattern2(){
        int n=5;
        for (int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");//print to print in same line...only print
            }
            System.out.println();//for newline  ...print with nextline
        }
        System.out.println();
        System.out.println();

    }




    static void pattern3(){
        int n=5;
        for (int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(i));
            
            System.out.println();//for newline  ...print with nextline
        }
        System.out.println();
        System.out.println();

    }


    static void pattern4(){
        int n=5;
        
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1|| i==n||j==1||j==n){

                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
                
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

    }




    static void pattern5(){
        int num=5;
        for(int)
    }







    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern4();
        

    }
    
}
