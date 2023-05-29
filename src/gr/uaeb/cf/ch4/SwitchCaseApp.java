package gr.uaeb.cf.ch4;

import java.util.Scanner;

/**
 *
 * Switch instead of IF THEN ELSE IF
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0 ;
        do {
            System.out.println("Please select one of the following");
            System.out.println("1. one player game");
            System.out.println("2. two player game ");
            System.out.println("3. team game ");
            System.out.println("4. quit");
            System.out.println("Please provide a choice of the gods ");
            choice = in.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("Start one player gmae ");
                    break;
                case 2 :
                    System.out.println("Start 2 player game ");
                    break;
                case 3 :
                    System.out.println("Team game ");
                    break;
                case 4 :
                    System.out.println("Quit game");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;


            }
        }while(choice != 4);

        System.out.println("Goodbye");
        System.exit(1);

    }
}
