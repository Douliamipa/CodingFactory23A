package gr.uaeb.cf.ch4;

import java.util.Scanner;

/**
 *
 * prosthetei kai polaplasiazei n protous akairaious
 */
public class AddMullApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ;
        int sum =0 ;
        int mul = 1 ;
         for (int i = 1 ; i <= 10 ; i++){
             System.out.println("give number");
             num = in.nextInt();
             sum = sum + num ;
             mul = mul * num ;
         }
        System.out.println("sum = " + sum);
        System.out.println("mul = " + mul);
    }
}
