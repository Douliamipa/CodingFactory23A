package gr.uaeb.cf.projects_dika_mou;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Project01 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(new File("C:/tmp/lottoin6.txt"));
             PrintStream ps = new PrintStream("C:/tmp/lotto6out.txt", StandardCharsets.UTF_8)){
            final int LOTTO_SIZE =6 ;
            int[] inputNumbers = new int[49];
            int[] result = new int[6];
            int num ;
            int pivot = 0 ;
            int window ;
            while ((num = in.nextInt()) != -1 && pivot != 48 ){
                inputNumbers[pivot++] = num;
            }


            window = pivot - LOTTO_SIZE ;

            for (int i = 0 ; i <= window ;i++){
                for (int j = i+1 ; j <= window +1 ; j++){
                    for ( int k = j+1 ; k <= window+2 ; k++){
                        for (int l = k+1 ; l <= window+3 ; l++){
                            for (int m = l+1 ; m <= window+4 ; m++){
                                for (int n = m+1; n <= window+5; n++){
                                    result[0] = inputNumbers[i];
                                    result[1] = inputNumbers[j];
                                    result[2] = inputNumbers[k];
                                    result[3] = inputNumbers[l];
                                    result[4] = inputNumbers[m];
                                    result[5] = inputNumbers[n];

                                    if (haxMax3NumsInSameTen(result) && hasMax2ContinuingNums(result)  && hasMax3SameEndingNums(result)  && hasMax4EvenNums(result)){
                                        ps.printf(" %d %d %d %d %d %d \n",result[0],result[1],result[2],result[3],result[4],result[5]);
                                    }
                                }
                            }
                        }
                    }
                }
            }

            Arrays.sort(inputNumbers);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static boolean hasMax4EvenNums (int[] arr){
        int countEvenNums = 0 ;

        for (int num :arr){
            if (num % 2 == 0){
                countEvenNums += 1;
            }
        }
        return countEvenNums <= 4 ;
    }

    public static boolean haxMax4OddNums(int[] arr){
        int countOddNums = 0 ;
        for (int num : arr){
            if (num % 2 != 0){
                countOddNums += 1;
            }
        }
        return countOddNums <= 4;
    }


    public static boolean hasMax2ContinuingNums(int[] arr){
        int continuingNums = 0 ;
        for (int i = 0 ; i < arr.length-1 ; i++){
            if (arr[i+1] - arr[i] == 1){
                continuingNums +=1 ;
            }
        }
        return continuingNums <= 2 ;
    }

    public static boolean hasMax3SameEndingNums(int[] arr){
        int counter = 0 ;
        String [] arrToString = new String [arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            arrToString[i]= String.valueOf(arr[i]);
        }

        for (int i = 0 ; i < arrToString.length ; i++){
            char lastPositionChar = arrToString[i].charAt(arrToString[i].length()-1);
            for (int k = i+1 ; k < arrToString.length ; k++){
                if (lastPositionChar == arrToString[k].charAt(arrToString[k].length()-1)){
                    counter += 1 ;
                }
            }
        }
        return counter <= 3 ;

    }

    public static boolean haxMax3NumsInSameTen(int[] arr){
        int counter = 0 ;
        for (int i = 0 ; i < arr.length-1 ; i++){
            if((arr[i] - arr[i+1])< 10){
                counter += 1;
            }
        }
        return counter <= 3 ;
    }
}
