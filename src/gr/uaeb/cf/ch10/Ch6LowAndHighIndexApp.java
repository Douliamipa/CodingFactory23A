package gr.uaeb.cf.ch10;

/**
 *
 * Assume an array {1,2,4,4,4,6,7,8,8,8,9,9}
 * the app return the low and high index for a key
 * that is included in the array . If the ey was 8 the algorithm should return {7,9} or {8,10} if we make  user-friendly optimization
 */
public class Ch6LowAndHighIndexApp {
    public static void main(String[] args) {

    }

    public static int [] getLowAndHighIndexOf(int[] arr , int key){
        int low = 0 ;
        int high = 0 ;
        int pivot ;

        if (arr == null) return  new int[]{} ; //epistrrefei enan keno pinaka  gia na apofugei nullPointerException

        for ( int i = 0 ; i < arr.length ; i ++){
            if (arr[i] == key){
                low = i ;
                break;
            }
        }
        high = low ;
        pivot = low + 1 ;

        while (pivot < arr.length && arr[pivot++] == key){
            high++ ;
        }
        return  new  int[]{low,high};



    }

}
