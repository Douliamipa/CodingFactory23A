package gr.uaeb.cf.epanalipsi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Iofaseis  {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:/tmp1/int.txt"));
        PrintStream ps = new PrintStream(new File("C:/tmp1/info.txt"));

        String token ;

        int num = 0 ;
        int sum = 0 ;

        int count = 0 ;
        double average = 0.0 ;

        while(sc.hasNext()){
            token =sc.next() ;
            if (isInt(token)){
                num = Integer.parseInt(token);
                count ++ ;
                sum += sum ;
            }
        }

        average =(double)  sum /count ;
         ps.println("the  sum is "+ sum);
         ps.println("the average is " + average);

        sc.close();
        ps.close();

    }

    public static boolean isInt(String s){
        try {
            Integer.parseInt(s);
            return true ;
        }catch (NumberFormatException e ){
            return  false ;
        }
    }


}
