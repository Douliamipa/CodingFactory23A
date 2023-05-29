package gr.uaeb.cf.ch2;

import java.util.Scanner;
import java.lang.*;

/**
 * Converts euros to USD
 * Recieves from standard input one integer that symbolizes the amount of euros and converts it in USD
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0 ;
        int totalUsaCents = 0 ;
        int usaDollars = 0 ;
        int usaCents = 0 ;

        System.out.println("please inert the amount of euros ");
        inputEuros = scanner.nextInt() ;
        totalUsaCents = 99 * inputEuros ;
        usaDollars = totalUsaCents /100 ;
        usaCents = totalUsaCents % 100 ;


        System.out.printf("the total amount of euros %d = %d dollars or %d cents ",inputEuros ,usaDollars,usaCents);


    }
}
