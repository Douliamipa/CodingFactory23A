package gr.uaeb.cf.ch6;

/**
 *
 * Selection sort
 * time complexity n^2
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[]arr= {6,8,2,14,3,25,12};
        int minVal;
        int minPosition ;


        for (int i = 0 ; i < arr.length-1 ; i++){
            minVal = arr[i];
            minPosition = i ;
            int tmp ;
            for (int j = i +1 ; j < arr.length ; j++){
                if (arr[j] < minVal){
                    minVal = arr[j];
                    minPosition = j ;

                }
            }
            tmp = arr[i];
            arr[i] = minVal ;
            arr[minPosition] = tmp ;

        }

        for (int item : arr){
            System.out.println(item + "");
        }

    }
}
