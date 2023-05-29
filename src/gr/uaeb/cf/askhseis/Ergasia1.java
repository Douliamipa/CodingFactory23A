package gr.uaeb.cf.askhseis;

import java.util.Random;

/**
 *
 *Βρήσει το μέγιστο ενός πίνακα  και επιστρέφει τη θέση του στον πίνακα
 */
public class Ergasia1 {
    public static void main(String[] args) {
        Random rand = new Random();
    int[] pinakas = new int[25];
    for (int i=0 ; i <= pinakas.length-1; i ++){
        pinakas[i] = rand.nextInt(300) ;
    }
//        for (int stoixeio : pinakas ) {
//            System.out.println(stoixeio + "");
//        }
        int thesiMax = getMaxPosition(pinakas);


        System.out.println("Το μέγιστο στοιχείο του πίνακα είναι στη θέση "+ thesiMax+1);
    }
    public static  int getMaxPosition (int[] arr){
        int maxValue = Integer.MIN_VALUE ;
        int flag = 0;
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
                flag = i ;
            }
        }
        return flag ;
    }


}
