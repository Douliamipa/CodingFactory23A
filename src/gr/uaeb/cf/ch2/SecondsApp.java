package gr.uaeb.cf.ch2;

import java.util.Scanner;

/**
 *
 * Reads hours , minutes and seconds and converts them to seconds
 */
public class SecondsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0 ;
        int totalSeconds = 0 ;
        final int SECONDS_PER_HOUR = 3600 ;
        final int SECONDS_PER_MINUTE = 60;
        System.out.println("Please insert hours , mins ,seconds ");
         inputHours = in.nextInt();
         inputSeconds = in.nextInt();
         inputSeconds = in.nextInt();

         totalSeconds =inputHours * SECONDS_PER_HOUR + inputMinutes *SECONDS_PER_MINUTE + inputSeconds ;
        System.out.printf("%d hours , %dminutes , %d seconds = %d total seconds ",
               inputHours,inputMinutes,inputSeconds,totalSeconds );




    }
}
