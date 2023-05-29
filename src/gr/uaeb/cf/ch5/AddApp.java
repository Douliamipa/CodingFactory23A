package gr.uaeb.cf.ch5;

/**
 *
 * prosthetei 2 akeraious me ti xrisi tis methodou add
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        int sum = 0 ;

        sum = AddApp.add(a,b);

        /*oi static  methodoi mporoun na kalesoun mono static methodous .
        an kaloume eksw apo tin klasi tote prepei na exoume olo to onoma tis methoudou pou perlamvanei kai to onoma tis klais  */
    }
    public static int add (int a , int b ){
        int sum = 0 ;
        sum = a + b ;
        return sum ;

    }
}
