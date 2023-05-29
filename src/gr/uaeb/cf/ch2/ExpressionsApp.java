package gr.uaeb.cf.ch2;

public class ExpressionsApp {
    public static void main(String[] args) {
        int num1 =12;
        int num2 = 5;
        int sum = 0;
        int sub = 0;
        int mul =0 ;
        int div = 0 ;
        int  mod = 0;
        sum  = num1 + num2 ;
        sub = num1 - num2 ;
        div = num1 / num2 ;
        mod = num1 % num2 ; //ypol diairesis

        System.out.printf("sum: %d , sub: %d ,mul: %d , div: %d , mod: %d" , sum , sub, mul ,div, mod );

        int result  =(num1 + num2  * (num2-(15/num1)));
        System.out.println("");
        System.out.println("the result is "+result);
        int result2 = ++result;
        System.out.println(result2);
        result2 += 10;
        System.out.println(result2);
        result2--;
        System.out.println(result2);




    }
}
