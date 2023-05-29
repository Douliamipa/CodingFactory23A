package gr.uaeb.cf.ch5;

/**
 *
 * upollogizei to a^n anadromika
 */
public class PowerRecursiveApp {
    public static void main(String[] args) {
        float a = 2.0f;
        float b = 3.0f;
        float power =0;
        power = power(a,b);
        System.out.println(power);


    }

    /**
     *
     * Recursive a^n
     * @param a the base
     * @param b the power
     * @return the power of a
     */
    public static float  power(float a , float b ) {

      if (b < 0) {
          return 1/power(a,-b);
      }
      if ( b == 0 )return 1;
      return  a *power(a,b-1);
    }


}
