package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 *
 * if a tank has less than a  quarter in fuel then an orange light turn on
 * if bot tanks have less fuel than a quarter then a red light turn on
 * the user gives true or false  depending if tank <1/4 or not
 */
public class OrangeRedSignalApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1lessThanQuarter = false;
        boolean istank2LTQuarter = false ;
        boolean orangeOn = false ;
        boolean redOn = false ;

        System.out.println("insert please if tank 1 , tank 2 are less than a quarter ");
        isTank1lessThanQuarter = in.nextBoolean();
        istank2LTQuarter = in.nextBoolean();

        orangeOn = isTank1lessThanQuarter || istank2LTQuarter ;
        redOn = isTank1lessThanQuarter && istank2LTQuarter ;
        System.out.println("orange On  " + orangeOn + "red On   "+ redOn );


    }
}
