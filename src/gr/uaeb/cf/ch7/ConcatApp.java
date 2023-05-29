package gr.uaeb.cf.ch7;

/**
 *
 * Concatinates two or more strings
 */
public class ConcatApp {
    public static void main(String[] args) {
        String title = "Dr";
        String firstName = "Douloouo";
        String lastName = "Giannakoouo";
        String fullName ;
        fullName= firstName + lastName ;

        String titledFullName ;

        titledFullName = title.concat(firstName).concat(lastName);

    }
}
