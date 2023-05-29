package gr.uaeb.cf.ch3;

import java.util.Scanner;

/**
 *
 * metraei to plithos twn thetikvn arithmwn pou dinei o user of the gods
 */
public class PossitivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0 ;
        int posCount = 0 ;
        System.out.println("plos gib nomber");
        num = in.nextInt();
        while (num >= 0 ){
            posCount++;
            System.out.println("plos gib nomber");
            num = in.nextInt();
        }
        System.out.println(posCount);
    }
}
