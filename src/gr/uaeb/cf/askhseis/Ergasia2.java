package gr.uaeb.cf.askhseis;

import java.util.Random;

public class Ergasia2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] pinakas = new int[25];
        for (int i=0 ; i <= pinakas.length-1; i ++){
            pinakas[i] = rand.nextInt(300) ;
        }
       System.out.println("Το δεύτερο μικρότερο στοιχείο του πίνακα είναι το "+ getSecondMinPos(pinakas));


    }
    public static int getSecondMinPos (int[] arr){
        int temp = 0 ;
       for (int i = arr.length-1; i > 0 ; i--){
           for (int j = 0 ; j < i ; j++){
               if (arr[j] > arr[j+1]){
                  temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
               }
           }
       }
       for (int element : arr){
           System.out.println(element);
       }
       return arr[1];



    }
}
