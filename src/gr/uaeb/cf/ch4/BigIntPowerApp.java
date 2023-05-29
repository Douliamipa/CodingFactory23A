package gr.uaeb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * upologizei to a^n me big integer
 */
public class BigIntPowerApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("0");
        BigInteger n = new BigInteger("0");
        BigInteger result = new BigInteger("1");

        System.out.println("Please insert two ints base and power");
        Scanner in = new Scanner(System.in);
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1 ; i <= n.intValue() ; i++){
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %d" , a , n,result);
    }
}
