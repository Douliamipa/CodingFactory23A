package gr.uaeb.cf.ch4;

import java.util.Scanner;

/**
 *
 * enas mikros vatrxos thelei na perasei ena potami
 * o frog vrisketai sti thesi X kai thelei na ftasei sti thesi Y i se thesi megaluteri apo to Y
 * o frog pidaei  a fixxed distanse  D
 * to programma vriskei ton elaxisto arithmo apo jumps poy o small frog prepei na kanei  wste na ftasei sto stoxo tou i na ton 3eperasei
 * gia paradeigma an exoume x= 10 y=85 kai d =30 tote o small frog tha xreiastei 3 jumps
 */
public class FroggApp {
    public static void main(String[] args) {
        int x ;
        int y ;
        int d ;
        int jumps = 0 ;
        Scanner in = new Scanner(System.in);
        System.out.println("please give  X,y,d");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();
       /* int counter = 0 ;
        for (int i = x ; i <= y ; i = i +d ){
            System.out.println("jump");
            counter++ ;
        }
        System.out.println("Jumps made "+ counter);  */

        jumps = (int)  Math.ceil((x-y)/(float)d);



    }
}
