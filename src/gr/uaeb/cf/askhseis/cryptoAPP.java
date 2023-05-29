package gr.uaeb.cf.askhseis;

import java.util.Scanner;

public class cryptoAPP {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" DWSE ENA SSTRING");
        String lexi = in.nextLine();
        int [] kryptografimenosPinakas= toASCIIplusOne(lexi);
//        for (int stoixeio : kryptografimenosPinakas){
//            System.out.println(stoixeio);
//        }

        char[] decryptedCharArray = toCharArrayFromASCIIplusOne(kryptografimenosPinakas);

        String lexiDecrypted = fromCharArrayToString(decryptedCharArray);
        System.out.println(" apokryptografimeni lexi " + lexiDecrypted);



    }

    public  static  int[] toASCIIplusOne (String lexi){
       char [] pinakasGrammatwn = lexi.toCharArray();
       int[] pinakasStoixeiwnSeASCII = new int[pinakasGrammatwn.length];
       for (int i = 0 ; i < pinakasStoixeiwnSeASCII.length ; i++){
           pinakasStoixeiwnSeASCII[i]=(int)pinakasGrammatwn[i]+1 ;
       }
       return pinakasStoixeiwnSeASCII ;
    }

    public  static  char[]  toCharArrayFromASCIIplusOne(int[]encrypted){
        int[] encryptedMinusOne = new int [encrypted.length];
        for (int i = 0 ; i < encryptedMinusOne.length ; i++){
            encryptedMinusOne [i] = encrypted[i]-1 ;
        }
        char [] fromASXIItoChar = new char[encryptedMinusOne.length];

        for (int i = 0 ; i< fromASXIItoChar.length ; i++){
            fromASXIItoChar[i] = (char) encryptedMinusOne[i] ;
        }
        return  fromASXIItoChar;
    }

    public static String fromCharArrayToString(char[] decryptedCharArray){
        String lexi = new String(decryptedCharArray);
        return lexi;
    }
}
