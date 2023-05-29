package gr.uaeb.cf.ch6;

import java.util.Arrays;

public class SymetricArray {
    public static void main(String[] args) {

    }
    public static boolean isArraySymmetric (int [] arr){
        boolean isSymmetric = true;
        for (int i = 0 ,j = arr.length-1;i < j;i++ , j--){
            if (arr[i] != arr[j]){
                isSymmetric = false ;
                break;
            }
        }
        return isSymmetric;
    }

    public static boolean isArrSymetric(int[] arr){
        boolean isSymmetric = true;
        int n = arr.length-1 ;
        for (int i = 0 ; i < n/2 ;i++){
            if (arr[i] != arr[n-i]) {
                isSymmetric = false;
                break;
            }

        }
        return isSymmetric;
    }

    public static  int getMissing(int[] arr){
        int missing = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i]-arr[i+1] > 2){
                missing = arr[i]+1;
            }
        }
        return missing;

    }
}
