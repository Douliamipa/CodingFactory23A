package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 *
 * ypollogizei to n!
 */
public class FactorialAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long facto = 1L ;
        int i = 1 ;
        int n = 0 ;
        System.out.println("Dwse N");
        n = in.nextInt() ;
        while (i <= n ){
            facto =facto * i ;
            i++ ;
        }
        System.out.println(facto);
    }
}
