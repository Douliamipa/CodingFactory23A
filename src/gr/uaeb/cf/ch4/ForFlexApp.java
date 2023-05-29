package gr.uaeb.cf.ch4;

import java.util.Scanner;

/**
 *
 * diavazei apo to stndard input to start value , end value , step kai ektupwnei to plithos twn epanalipsewn
 */
public class ForFlexApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue ;
        int endValue ;
        int step ;
        int iterations = 0 ;
        System.out.println("Provide start , end and step values");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();
         for (int i = startValue ; i <= endValue ; i = i + step){
             iterations ++ ;
             System.out.println(i + "");

         }

        System.out.println(" Iterations :" + iterations);
    }

}
