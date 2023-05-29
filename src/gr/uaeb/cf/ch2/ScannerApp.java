package gr.uaeb.cf.ch2;

import java.util.Scanner;

/**
 * Diavazei apo standard input diladi to pliktrologio  kai tous prosthetei
 *
 */
public class ScannerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("dwse arithmo");
        num1 = sc.nextInt();
        System.out.println("xana dwse arithmo");
        num2 = sc.nextInt();

        int sum = num2 + num1 ;
        System.out.println(" to athroisma einai " + sum);


    }
}
