package gr.uaeb.cf.askhseis;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ask {
    public static void main(String[] args) {
        String fname ;
        fname=getFirstName();
        System.out.println(fname);

    }
    public static  String  getFirstName() throws InputMismatchException {
        String name = null ;
        System.out.println("give first name");
        try (Scanner in = new Scanner(System.in)){


            if (in.hasNext()){
                name = in.nextLine();
            }


        }catch (InputMismatchException e){
            System.out.println("Invalid string");
            throw  e;
        }

        return name ;
    }
}
