package gr.uaeb.cf.ch4;

import java.util.Scanner;

/**
 *
 * Reads 1 char with Scanner
 */
public class CharScannerAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        char inputChar ;
        inputChar = in.next().charAt(0); //diavazei mono ton prwto xaraktira kai ton printarei
        System.out.println(" Char :" +inputChar);



    }
}
