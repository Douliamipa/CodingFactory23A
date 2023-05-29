package gr.uaeb.cf.ch5;

import java.util.Scanner;

/**
 *
 * apofasizei an ena int einai artios i perittos
 */
public class EvenOddApp {
    public static void main(String[] args) { //mono oi static methodoi mporoun na kalestoun ws EvenOddApp.isEven oi upol kaloudai mono me to onoma

        int a ;
        boolean apofasi ;
        Scanner in = new Scanner(System.in);
        System.out.println("dwse aritmo");
        a= in.nextInt();
         apofasi = EvenOddApp.isEven(a);
        System.out.println("the cliam it is Even is :" +apofasi );

    }

    public static boolean isEven (int a ) {
        return a % 2 == 0 ;
//        if (a % 2 == 0  ){
//            return true ;
//        }else {
//            return false ;
//        }
    }
}
