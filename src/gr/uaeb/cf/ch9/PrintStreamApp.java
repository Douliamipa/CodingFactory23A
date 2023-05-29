package gr.uaeb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * prints with PrintStream
 */
public class PrintStreamApp {
    public static void main(String[] args) {

        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt", StandardCharsets.UTF_8)){
            // logika den uparxei to path
            ps.println("Hello Coding Factory");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
