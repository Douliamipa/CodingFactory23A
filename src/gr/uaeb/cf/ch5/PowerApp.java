package gr.uaeb.cf.ch5;

import java.util.Scanner;

/**
 * ypollogizei to a^n
 */
public class PowerApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("give a");
        int a = in.nextInt();
        System.out.println("give n");
        int n = in.nextInt();
        int result = pow(a,n);
        System.out.printf("result %d",result);

    }

    /**
     *  returns the power of an int
     * @param a the base
     * @param n the power to raise
     * @return power of a^n
     */
    public static int pow (int a , int n){
       int power =1 ;
       for (int i = 1 ; i <= n ; i++){
           power *= a ;

       }
       return  power ;
    }
}
