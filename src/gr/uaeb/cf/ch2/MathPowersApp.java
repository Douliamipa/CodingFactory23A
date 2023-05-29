package gr.uaeb.cf.ch2;

import java.util.Scanner;

/**
 * finds the sqared and cubed  of an int given by the user
 */
public class MathPowersApp {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int inputnum =0 ;
        System.out.println("Please insert a number ");
        inputnum = scanner.nextInt();
        System.out.printf("num : %d , square : %d , cube : %d",inputnum,(int) Math.pow(inputnum,2),(int) Math.pow(inputnum,3) );

    }
}
