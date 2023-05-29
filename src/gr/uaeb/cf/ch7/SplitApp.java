package gr.uaeb.cf.ch7;

/**
 *
 * SPlits a string
 */
public class SplitApp {
    public static void main(String[] args) {
        String s1 = "Athens Uni of Econ and Buisness" ;
        String [] tokens = s1.split(" ");
        for (String token : tokens){
            System.out.println(token);
        }
    }
}
