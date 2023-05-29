package gr.uaeb.cf.ch4;

import java.util.Scanner;

/**
 * o xristis exei 10 eukairies gia na vrei ena mustiko kleidi of the gods
 * an to vrei nwritera ap;o ti dekati fora h for tha prepei na termatisei of the gods
 */
public class FindTheSecretApp {
    public static void main(String[] args) {
        final int SECRET_KEY = 12 ;
        int num ;
        boolean found = false ;
        Scanner in = new Scanner(System.in);
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println("Please give number");
            num= in.nextInt();
            if (num == SECRET_KEY){
                found = true ;
                break;
            }
        }
        if (found){
            System.out.println("to vrikes dike mou popipipipo ");
        }else {
            System.out.println("Vrikes 2 poukious");
            System.exit(1);
        }

    }
}
