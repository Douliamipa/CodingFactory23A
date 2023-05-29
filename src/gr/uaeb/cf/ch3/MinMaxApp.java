package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 * finds min or/and max of 2 numbers given by the user
 */
public class MinMaxApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0 ;
        int num2 = 0 ;
        int min = 0;
        int max = 0;

        System.out.println("Please provide two ints");
        num1 = in.nextInt();
        num2 = in.nextInt();

        if (num1 > num2){
            max = num1 ;
            min = num2 ;
        }else if (num1 < num2){
            max = num2 ;
            min = num1 ;
        }else {
            System.out.println("Nums are equal thewn");
        }

        System.out.println("Min :" + min);
        System.out.println("Max :"+ max);



    }
}
