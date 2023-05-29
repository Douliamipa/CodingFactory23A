package gr.uaeb.cf.ch2;

import java.util.Scanner;

/**
 *
 * The user gives one 2 digit int number kai we find the summ of those 2 digits
 */
public class IntDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0 ;
        System.out.println("Please give a number with 2 digits ");
        num = scanner.nextInt();
        leftDigit = num / 10 ;
        rightDigit = num % 10 ;
        sumOfDigits = leftDigit + rightDigit ;
        System.out.println(sumOfDigits);

    }
}
