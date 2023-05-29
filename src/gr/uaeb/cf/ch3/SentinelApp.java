package gr.uaeb.cf.ch3;
/**
 * keeps reading until a sentinel value is provided
 */

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0 ;
        System.out.println("Please provide a num");
        num = in.nextInt();
        int iterations = 0 ;


        while (num != 0){
            iterations++;
            //System.out.println(num);
            System.out.println("Please provide a num");
            num = in.nextInt();
        }
        System.out.printf("%d iterations",iterations);
    }
}
