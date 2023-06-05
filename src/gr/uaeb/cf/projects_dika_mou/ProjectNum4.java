package gr.uaeb.cf.projects_dika_mou;

import java.util.Arrays;
import java.util.Comparator;

public class ProjectNum4 {
    public static void main(String[] args) {
        int[][] arr = { {1012, 1136},{1317, 1417}, {1015, 1020},{1132,1155},{1523,1535}};
        int[][]entransesAndExitsTimeline = new int[2* arr.length][2];
        entransesAndExitsTimeline=timeTableCreation(arr);
        Arrays.sort(entransesAndExitsTimeline, Comparator.comparing(a->a[0]));

        for (int i = 0 ; i < entransesAndExitsTimeline.length; i ++){
            System.out.println(entransesAndExitsTimeline[i][0] + " " + entransesAndExitsTimeline[i][1]);
        }

    }
    public static int[][] timeTableCreation(int[][]arr){
        int[][] entransesAndExitsTimeline = new int [2*arr.length][2];
        for (int i = 0 ; i < arr.length ; i++){
            entransesAndExitsTimeline[i*2][0]=arr[i][0];
            entransesAndExitsTimeline[i*2][1]=1;
            entransesAndExitsTimeline[i*2+1][0]=arr[i][1];
            entransesAndExitsTimeline[i*2+1][1]=0;
        }
        return entransesAndExitsTimeline ;
    }

    public static int getMaxCurrentCars(int[][]entransesAndExitsTimeLine){
        int count = 0 ;
        int maxCount = 0 ;
        for (int[] row : entransesAndExitsTimeLine){
            if (row[1] == 1){
                count++;
                if (count > maxCount){
                    maxCount = count ;
                }else {
                    //if row[1]=0
                    count--;
                }

            }
        }
        return maxCount;
    }
    }



