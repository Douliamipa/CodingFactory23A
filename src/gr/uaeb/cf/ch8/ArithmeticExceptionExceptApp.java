package gr.uaeb.cf.ch8;

public class ArithmeticExceptionExceptApp {
    public static void main(String[] args) {
        int num1 = 5 ;
        int num2 = 0 ;
        int result ;


       if (num2 == 0 ){
           System.out.println("please ..");
           System.exit(1);
       }

           result = num1/num2 ;


        //System.out.println(result);
    }
}
