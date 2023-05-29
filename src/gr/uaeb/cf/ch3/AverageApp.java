package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 * finds the average grade of a student . total and count are given
 */
public class AverageApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0 ;
        int count = 0 ;
        int avg = 0 ;

        System.out.println("Please provide total and count ");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0 ){
            System.out.println("Invalid count ");
            System.exit(1);
        }


        if (total < 0 ){
            System.out.println("Invalid total ");
            System.exit(1);
        }

        avg = total / count;
        if (avg > 10){
            System.out.println("Invalid AVG ");
            System.exit(1);
        }

        if (avg>= 9){
            System.out.println("Excelent");
        } else if (avg >= 7) {
            System.out.println("Very Good");
        } else if (avg >= 5) {
            System.out.println("Good");
        }else {
            System.out.println("Fail");
        }


    }
}
