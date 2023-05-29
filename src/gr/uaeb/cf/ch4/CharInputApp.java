package gr.uaeb.cf.ch4;

import javax.imageio.IIOException;
import java.io.IOException;

/**
 *
 * reads 1 char with System.in.read()
 */
public class CharInputApp {
    public static void main(String[] args) throws IOException {
        char input ;
        System.out.println("Please insert an ASCII char");

        input = (char) System.in.read(); //to lathos edw onomazetai exception
        System.out.println("char :" + input);





    }
}
