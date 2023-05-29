package gr.uaeb.cf.ch3;

import java.util.Enumeration;
import java.util.Scanner;

/**
 *
 * Shows the usage of break and continue
 */
public class BreakContinueApp {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0 ;
        int sum = 0 ;
        boolean found = false;

        while (true){
            System.out.println("Please provide a num");
            num = in.nextInt();
            if (num == 5){
                continue;
            }
            sum += num ;
            if (num == 10){
                //System.out.println("Bingo");
                found = true;
                break;
            } else {
                System.out.println("Try Again");
            }
        }
        System.out.println("SUM :" + sum);
    }
}
