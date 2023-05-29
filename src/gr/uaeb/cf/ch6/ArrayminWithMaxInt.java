package gr.uaeb.cf.ch6;

public class ArrayminWithMaxInt {
    public static void main(String[] args) {
        int[] arr = {6,90,4,17};

        int minPos = 0;
        int minVal = Integer.MAX_VALUE ;
        for (int i = 0 ; i < arr.length ; i++ ){
            if (arr[i]<minVal){
                minPos = i ;
                minVal = arr[i];
            }
        }
    }

}
