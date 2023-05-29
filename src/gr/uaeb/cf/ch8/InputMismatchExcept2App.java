package gr.uaeb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcept2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum ;
        final int MAGINC_NUM = 12 ;


        while (true){
            System.out.println("please insert num");

            if (in.hasNextInt()){
                inputNum = in.nextInt();
            }else {
                in.nextLine();
                System.out.println("Error please insert valid number");
                continue;
            }
            if (inputNum == MAGINC_NUM){
                System.out.println("Great");
                break;
            }

        }

        System.out.println("Thanks for using the Magic App");
    }
}
