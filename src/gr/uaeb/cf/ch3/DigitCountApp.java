package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 * ypollogizei to plithos twn psifiwn enos akairaiou , to athroisma twn psifiwn kai to athroisma tou prwtou psifiou kai tou teleutaiou of the gods
 */
public class DigitCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0 ;
        int num = 0 ;
        int count = 0 ;
        int summ = 0 ;
        int sumLR = 0 ;
        int currentDigit = 0 ;



        System.out.println("plos dose num");
        inputNum = in.nextInt();

        num = inputNum ;
        do {
            count++;
            currentDigit = num % 10 ;
            summ += currentDigit;
            num = num / 10 ;

        }while (num != 0 );
        System.out.println("Count :" + count);
        System.out.println("Sum of digits :" + summ);
    }

}
