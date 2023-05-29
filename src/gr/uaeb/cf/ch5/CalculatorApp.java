package gr.uaeb.cf.ch5;

import java.util.Scanner;

/**
 *
 * ulopoiei enan aplo calculator pou parexei tis upiresies  add, sub , mul , div , mod
 * emfanizei ena menu pros ton xristi me epiloges , lambanei tin timi tis epilogis kai sti sunexeia tis times num 1 , num 2
 * telika emfanizei to apotelesma
 *
 */
public class CalculatorApp {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = 0;
        int result = 0 ;
        do{
           printMenu();
           choice =getNextInt("Please enter your choice");

             if (ischoiceInvalid(choice)){
                 System.out.println("Choice is invalid");
                 continue;
             }
             if (ischoiceQuit(choice)){
                 break;
             }
             result = onChoiceGetResult(choice);
            System.out.println("Result =" + result);


        }while (true);
    }
    public static void printMenu(){
        System.out.println("Epelexe ena apo ta parakatw ");
        System.out.println("1. prosthesi ");
        System.out.println("2. afairesi ");
        System.out.println("3. pollaplasiasmos ");
        System.out.println("4. diairesi  ");
        System.out.println("5. upoloipo");
        System.out.println("6. exodos ");
    }
    public static int getNextInt(String message){
        System.out.println(message);
        return in.nextInt();
    }
    public static boolean ischoiceInvalid(int choice){
        return choice < 1 || choice > 6 ;
    }
    public static boolean ischoiceQuit(int choice){
        return  choice == 6 ;
    }
    public static int add (int num1 , int num2 ){
        return num1 + num2 ;
    }
    public static int sub (int num1 , int num2 ){
        return num1 - num2 ;
    }
    public static int mul (int num1 , int num2 ){
        return num1 * num2 ;
    }
    public static int div (int num1 , int num2 ) {
        int value = 0;
        if (num2 == 0) {
            value = Integer.MAX_VALUE;
        } else {
            value = num1 / num2;
        }
        return value;
    }
    public static int mod (int num1 , int num2 ){
        if (num2 == 0){
            return Integer.MAX_VALUE ;
        }
        return num1 % num2 ;
    }
    public static  int onChoiceGetResult (int choice ){
        int num1 = getNextInt("Please inset the first number");
        int num2 = getNextInt("Please inset the second number");
        int result= 0 ;

        switch (choice){
            case 1 :
                result = add(num1 , num2) ;
                break;
            case 2 :
                result = sub(num1 , num2);
                break;
            case 3 :
                result =mul(num1,num2);
                break;
            case 4 :
                result =div(num1,num2);
                break;
            case 5 :
                result = mod(num1 , num2);
                break;
            case 6 :

            default:
                break;


        }
        return result ;
    }
}
