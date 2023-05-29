package gr.uaeb.cf.ch7;

import java.util.Scanner;

/**
 *
 * Typecast from string to int
 */
public class TypecastApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme ;
        int num ;
        System.out.println("Please insert num  (int )");
        lexeme = in.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is" + num);
    }
}
