package gr.uaeb.cf.projects_dika_mou;

import java.io.*;
import java.util.Scanner;

import static java.lang.Character.codePointAt;

public class ProjectNum3 {
    static BufferedReader in;

    static {
        try {
            in = new BufferedReader(new FileReader("C:/tmp/textfile.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args)  {

       int[][] charsCounter = new int[256][2];
       charsCounter = populate(charsCounter);
       charsCounter= charactersCounted(charsCounter);
       char[] charactersRecord =actualSymbol(charsCounter);
       double[] timesSeenInFile = new double[charsCounter.length] ;
       timesSeenInFile = timesSeenInWholeFile(charsCounter);

       for (int i = 0 ; i < charsCounter.length ; i ++){
           System.out.println( "Το στοιχείο "+ charactersRecord[i] +"Εμφανίστηκε στο δωθέν αρχείο"+ charsCounter[i][1] + "φορές");
       }

       for (int i = 0 ; i < charsCounter.length ; i++){
           System.out.println("Το στοιχείο"+ charactersRecord[i] + "Εμανήστικε " + timesSeenInFile[i] *(100/100) + "Σε σχέση με τα υπόλοιπα στοιχεία " );
       }



    }

    public static double[] timesSeenInWholeFile(int[][] charsCounter){
        int sum = 0 ;
        double[]timesSeenInWholeFile = new double[charsCounter.length] ;


        for (int i = 0 ; i < charsCounter.length ; i++){
            sum = sum +charsCounter[i][1];
        }

        for (int i = 0 ; i < charsCounter.length ; i++){
            timesSeenInWholeFile[i] = charsCounter[i][1]/sum ;
        }
        return timesSeenInWholeFile;
    }

    public static char[] actualSymbol(int[][] charsCounter) {
       char[] charFinal = new char[253];
        try {
            String line = in.readLine();



            while (line != null) {
                char[] charrArray = new char[line.length()];

                for (int i = 0; i < line.length(); i++) {
                    charrArray[i] = line.charAt(i);
                }

                for (int i = 0; i < charrArray.length; i++) {
                    for (int j = 0; j < charsCounter.length; j++) {
                        if (codePointAt(charrArray, i) == charsCounter[j][0]) {
                            charFinal[i] = charrArray[i];
                            break;
                        }

                    }
                }
                line = in.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return charFinal;
    }





    public static int[][] populate(int[][] charsCounter){

        for (int i = 0 ; i < charsCounter.length  ; i++  ){

            charsCounter[i][0] = -1;
            charsCounter[i][1] = 0 ;
        }
        return charsCounter ;
    }
    public static int[][] charactersCounted(int[][] charsCounter){
        try {
            String line = in.readLine();



            while(line != null){
                char[] charrArray = new char[line.length()];

                for (int i = 0 ; i < line.length() ; i++){
                    charrArray[i] = line.charAt(i);
                }

                for (int i = 0 ; i < charrArray.length ; i ++ ){
                    for (int j = 0 ; j < charsCounter.length ; j ++){
                        if (codePointAt(charrArray,i) == charsCounter[j][0]){
                            charsCounter[j][1] +=1;
                            break;
                        } else if (charsCounter[j][0] == -1 ) {
                            charsCounter[j][0] = codePointAt(charrArray,i);
                            charsCounter[j][1] += 1;
                            break;

                        }

                    }
                }
                line = in.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return charsCounter;
    }


}
