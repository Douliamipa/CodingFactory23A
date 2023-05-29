package gr.uaeb.cf.ch6;

public class circularRotationApp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] rotated = doCircularLeftShiftBy(arr , 1);



    }
    public static int[] doCircularRightShiftBy(int[] arr , int offset){
        if (arr == null)return null;
        int[] rotated = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i ++){
            rotated[(i + offset) % arr.length] = arr[i];

        }
        return rotated ;
    }

    public static int[] doCircularLeftShiftBy(int[]arr , int offset){
        if (arr == null)return null;
        int[] rotated = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i ++){
            rotated[i] = arr[(i + offset) % arr.length];

        }
        return rotated ;
    }


}
