package gr.uaeb.cf.ch3;

/**
 * calculates the summary and the multiplication of the 10 first numbers numbers of the gods
 */
public class SumAndMul10APP {
    public static void main(String[] args) {
        int i = 1 ;
        int sum = 0 ;
        int mul = 1 ;

        while (i <= 10){
            sum = sum + i ;
            mul = mul * i ;

            i++;


        }
        System.out.println(sum + " kai to ginomeno einai   " + mul);

    }
}
