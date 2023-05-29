package gr.uaeb.cf.ch6;

public class Bubblesort {
    public static void main(String[] args) {
        int [] arr = {10,15,8,23,3,12};
        for (int i=arr.length-1 ; i >0 ;i--){
            for (int j=0 ;j<i ; j++){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        for (int element : arr){
            System.out.println(element + "");
        }
    }
    public static void swap (int[ ] arr, int i , int j ){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]= tmp;
    }
}
