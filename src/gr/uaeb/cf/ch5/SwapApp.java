package gr.uaeb.cf.ch5;

/**
 *
 * antallasei amivaia2 times pou dinei o xristis
 */
public class SwapApp {
    public static void main(String[] args) {
        int a = 10  ;
        int b = 20 ;
        System.out.println("a=" + a + ""+"b="+ b );
        swap(a,b);
        System.out.println("a=" + a +""+ "b="+ b );

    }

    /**
     *
     * swaps  a,b a-> b , b ->a
     * @param a the first value
     * @param b the seconde value
     */
    public static void swap(int a , int b ){
        int tmp = a ;
        a = b ;
        b = tmp;

    }
}
