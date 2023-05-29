package gr.uaeb.cf.askhseis;

import java.io.IOException;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Excersize9App {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws InputMismatchException , IOException{


        double averageOgGreades ;
        String lname ;
        String fname;
        String avgAsString ;

        PrintStream ps = new PrintStream("C:/tmp/ask9.txt");
        String [] fullinfo = new String[3] ;
        int[] grades = new int[2];



        fname = getFirstName();
        lname = getLastName();
        grades = getGrades();
        averageOgGreades = getAvg(grades);
        avgAsString = Double.toString(averageOgGreades);
        fullinfo = getFullInfo(fname,lname,avgAsString);
        print(ps ,fullinfo);

    }

    public static String [] getFullInfo(String fname , String lname , String avgAsString){
        String[] fullInfoArray = {fname,lname,avgAsString};
        return  fullInfoArray;
    }
    public static void print(PrintStream ps , String[] fullInfo){
        for (int i = 0 ; i < fullInfo.length ; i++){
            ps.print(fullInfo[i]+ " "+ ",");
        }

    }






    public static String getFirstName() throws InputMismatchException {
        Logger logger = getLogger();
        String name = null;
        System.out.println("give first name");
       try {
           name = in.nextLine();
       }catch (InputMismatchException e){
           System.out.println("You gave a wrong  String ");
           logger.severe("Wrong input by the user ");
       }
        return name;
    }


    public static String getLastName() throws InputMismatchException {
        Logger logger = getLogger();
        String name = null;
        System.out.println("give last name");
        try {
            name = in.nextLine();
        }catch (InputMismatchException e){
            System.out.println("You gave a wrong  String ");
            logger.severe("Wrong input by the user ");
        }
        return name;
    }


    public static int[] getGrades() throws InputMismatchException {
        int[] grades = new int[2];
        Logger logger = getLogger();
        System.out.println("Please give the grades of two courses ");


        try  {
            for (int i = 0; i < grades.length; i++) {
                if (in.hasNextInt()) {
                    grades[i] = in.nextInt();
                }
                if (grades[i] < 5 || grades[i] > 10) {
                    logger.severe("You gave wrong values to the grades ");


                }
            }
        } catch (InputMismatchException e) {
            System.out.println("you didnt give an acceptrable grade ");
            throw e;
        }
        return grades;
    }


    public static Logger getLogger(){
        Logger logger = Logger.getLogger(Excersize9App.class.getName());
        Handler fileHandler ;
        try {
            fileHandler = new FileHandler("C:/tmp/log.txt" , true);
            fileHandler.setFormatter(new SimpleFormatter());
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
        logger.addHandler(fileHandler);
        return logger ;
    }

    public static double getAvg(int[] arr) throws ArithmeticException{
        int sum = 0 ;
        double avg = 0;

        for (int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
        }

        try {
            avg= (double) sum /(double) arr.length ;
        }catch (ArithmeticException e){
            e.printStackTrace();
            throw  e ;
        }
        return  avg;

    }
}
