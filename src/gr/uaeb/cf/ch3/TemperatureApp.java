package gr.uaeb.cf.ch3;

import java.awt.*;
import java.util.Scanner;

/**
 * Desides  if it is snowing  regarding the temperature  .If the temperture is bellow 0 then it snow , if not then it isnt snowing
 * the user gives the temperature
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false ;
        int temp = 0 ;
        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isSnowing = temp <0 ;
        System.out.println("Is snowing is  " + isSnowing);


    }
}
