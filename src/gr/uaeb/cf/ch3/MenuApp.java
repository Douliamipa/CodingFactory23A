package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 * prints in replay a menu of choices until the user chooses to exit
 */
public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0 ;
        do {
            System.out.println("choose one of the bellow");
            System.out.println("1 eisagogi proiontos ");
            System.out.println("2 diagrafi proiontos ");
            System.out.println("3 exodos ");
            choice = in.nextInt();

        }while (choice != 3);
    }
}
