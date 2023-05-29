package gr.uaeb.cf.ch6;

public class ArrayMinMaxApp {
    public static void main(String[] args) {
        int [] arr = {30,11,80,7,15};
        int minPos = 0;
        int minVal =arr[minPos];
        for (int i = 1 ; i < arr.length ; i++){
            if (arr[i] < minVal){
                minPos = i ;
                minVal = arr[i];

            }
        }
        System.out.printf(" min position %d , min value  %d" , minPos+1 , minVal);
    }

}
