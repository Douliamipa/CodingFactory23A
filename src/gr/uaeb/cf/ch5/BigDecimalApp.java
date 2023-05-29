package gr.uaeb.cf.ch5;

import java.math.BigDecimal;

public class BigDecimalApp {
    public static void main(String[] args) {
        BigDecimal actutal = new BigDecimal("0.0");
        BigDecimal expected = new BigDecimal("1.0");
         for (int i = 0 ; i <=10 ; i++){
             actutal = actutal.add(BigDecimal.valueOf(0.1));
             System.out.println(actutal);
             System.out.println(expected);

             if ( actutal.equals(expected)){
                 System.out.println("equals");
             }else {
                 System.out.println("not equals");
             }
         }
    }
}
