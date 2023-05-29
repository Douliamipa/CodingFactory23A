package gr.uaeb.cf.ch6;

/**
 *
 * Δήλωση αρχικοποίηση πίνακα  και populate
 */
public class PopulateArray {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0]= 5;
        arr[1]=7;
        arr[2]=8 ;

        int [] arr2 = {1,5,8,9,11} ;
        int [] arr3 = new int [ ] {4,6,9,10} ;


        for (int item : arr){
            System.out.println(item + "");
        }


    }
}
