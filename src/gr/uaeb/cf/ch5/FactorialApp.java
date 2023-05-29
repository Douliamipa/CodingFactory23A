package gr.uaeb.cf.ch5;

import java.util.Scanner;

/**
 *
 * upollogizeis to paragodinko me ti methodo facto
 */

public class FactorialApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please inset n");
        int n ;
        n = in.nextInt();
        int result ;
        result = facto(n);
        System.out.println(result);


    }

    /**
     *
     * returns n!
     *
     * @param n the number (n) of n!
     * @return 1*2*3*4*....*n
     */
    public static int facto (int n){
        int result =1 ;
        for (int i =1 ;i <= n ; i++){
            result *= i ;

        }
        return result;
    }
}
