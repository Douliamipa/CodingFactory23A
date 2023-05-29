package gr.uaeb.cf.ch4;

/**
 *
 * infinite for loop
 */
public class SpecialForCaseApp {
    public static void main(String[] args) {
        int counter = 0 ;
        for (;;){              /* auto einai to while true tis for */
            System.out.println("forever");
            counter ++ ;
            if ( counter % 20 == 0) System.out.println();
            if (counter == 100) break;
        }

    }
}
