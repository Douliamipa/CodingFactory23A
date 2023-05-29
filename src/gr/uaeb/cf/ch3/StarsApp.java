package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 *
 * prints n number of stars that are given from the user
 */
public class StarsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0 ;
        int i= 0 ;
        System.out.println("please  insert numer of stars ");
        numberOfStars = in.nextInt();
        while (i <= numberOfStars){
            System.out.print("*");
            i++;
            if (i % 50 == 0){
                System.out.println();
            }
        }
    }
}
