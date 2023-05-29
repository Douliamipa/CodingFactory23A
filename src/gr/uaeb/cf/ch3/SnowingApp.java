package gr.uaeb.cf.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        boolean isSnowing = false ;
        boolean isRaining = false ;
        int temp = 0 ;

        System.out.println("Please inset if it's raining");
        isRaining = in.nextBoolean();
        System.out.println("please inset temperature");
        temp = in.nextInt();
        isSnowing = isRaining && (temp<0) ;

        System.out.println("is snowing   "+ isSnowing);


    }
}
