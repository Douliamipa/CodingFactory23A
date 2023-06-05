package gr.uaeb.cf.projects_dika_mou;

import java.security.Key;
import java.util.*;

public class ProjectNum5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[30];
        Random random = new Random();
        int min = 1;
        int max = 50;
        for (int i = 0 ; i < arr.length ; i++){
            arr[i]= random.nextInt(max - min + 1) + min;
        }
       for (int i = 0 ; i < arr.length ; i++){
           System.out.print(arr[i] + " ");
       }
        Arrays.sort(arr);
//        for (int i = 0 ; i < arr.length ; i++){
//            System.out.print(arr[i] + " ");
//        }

//        int[] lowAndHighIndex = new int[arr.length];
        getLowAndHighIndexOf(arr,in.nextInt());



    }

    public static int[] getLowAndHighIndexOf(int[] arr ,int key){
        int counter = 0 ;
        Integer indexes[] = new Integer[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] == key) {
                indexes[i]=i;
            }else {
                indexes[i] = 0 ;
            }
        }


        Arrays.sort(indexes,Collections.reverseOrder());



        for (int i= 0 ; i< indexes.length ; i++){
            if (indexes[i] != 0){
                counter +=1;
            }
        }
        int [] indexeisWithoughtZeros = new int[counter];


        for (int i = 0 ; i < indexeisWithoughtZeros.length ; i++){

        indexeisWithoughtZeros[i]= indexes[i];
       }

        System.out.println(" oi theseis einai");
        for (int i = 0 ; i < indexeisWithoughtZeros.length ; i++){
            System.out.println(indexeisWithoughtZeros[i]);
        }

        int [] highAndLowIndexesPositions = new int[2];
       highAndLowIndexesPositions[0]= indexeisWithoughtZeros[indexeisWithoughtZeros.length-1];
        highAndLowIndexesPositions[1]= indexeisWithoughtZeros[0];




        return indexeisWithoughtZeros;
    }


}
