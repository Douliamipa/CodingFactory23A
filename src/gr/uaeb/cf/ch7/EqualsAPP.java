package gr.uaeb.cf.ch7;

/**
 *
 * COmpares two strings fow equality
 */
public class EqualsAPP {
    public static void main(String[] args) {

        String s1 = "Athens";
        String s2 = "Athens";
        String s3 = new String("Athens");


        if (s1.equals(s2)){
            System.out.println("Strings s1 and s2 are equal ");
        }

    }
}
