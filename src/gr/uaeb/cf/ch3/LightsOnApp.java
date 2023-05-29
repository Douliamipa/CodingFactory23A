package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Desices if the lights of a car are supposed to turn on taking into consideration if it rains and at the same time
 * one of the 2 following are true
 * is dark or we are in motion(vel>100) . Theese values are given by the user (standard input)
 */


public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        boolean isRaining = false ;
        boolean isDark = false ;
        boolean isRunning = false ;
        int speed = 0 ;
        boolean lightsOn = false ;

        System.out.println("please enter if it is  raining ");
        isRaining = in.nextBoolean();
        System.out.println("please insert if it is dark ");
        isDark = in.nextBoolean();
        System.out.println("please insert car speed ");
        speed = in.nextInt() ;
        isRunning = speed > 100 ;


        lightsOn = isRaining && (isDark || isRunning);
        System.out.println(lightsOn);
    }

}
