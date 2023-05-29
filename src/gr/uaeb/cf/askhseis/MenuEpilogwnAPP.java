package gr.uaeb.cf.askhseis;

import java.util.Scanner;

public class MenuEpilogwnAPP {
    public static void main(String[] args) {
        menu();
       int epilogi = getChoice();
       printChoice(epilogi);
       try {
           printChoice(epilogi);
       }catch (IllegalArgumentException e){
           System.out.println("Η επιλογη που δώσατε δεν είναι σωστή Παρακαλώ επιλέξτε ξανά");
       }






    }

    public static void menu(){
        System.out.println("Please select one of the following");
        System.out.println("1. one player game");
        System.out.println("2. two player game ");
        System.out.println("3. team game ");
        System.out.println("4. online game");
        System.out.println("5. exit");

    }

    public static int getChoice(){
        Scanner in = new Scanner(System.in);

        int epilogi ;
        while (true){
            System.out.println("Παρακαλώ δώστε επιλογή από το 1 έως το 4  για να επιλεξετε μία από τις παραπάνω επιλογες");
            if (in.hasNextInt()){
                epilogi=in.nextInt();
               if (epilogi < 1 && epilogi > 4){
                   System.out.println(" Αδύνατη επιλογή  παρακαλώ προσπαθήστε ξανά");
                   continue;
               }
                break;
            }else {
                System.out.println("Δεν δώσατε σωστό αριθμό επιλογής ");
                in.nextLine();
                continue;
            }
        }
        return epilogi;
    }

    public static void printChoice(int epilogi) {
       if (epilogi!= 1 && epilogi!= 2 &&epilogi!= 3 &&epilogi!= 4 &&epilogi!= 5){
           throw new IllegalArgumentException("ΔΕΝ ΔΩΣΑΤΕ ΣΩΣΤΟ ΑΡΙΘΜΟ");
       }else {
           System.out.println("Δώσατε την επιλογή "+ epilogi);
       }
       return;
    }
}
