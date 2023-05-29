package gr.uaeb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class AutoFlushApp {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/fos.txt"),true, StandardCharsets.UTF_8)){
            //otan dilwnoume etsi to printstream kanei auto to flush
            //ama dwsoume "C:/tmp/fos.txt" , true sto FIle output stream kane append to idi uparxon arxeio
            ps.println("Καλησπέρα");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
