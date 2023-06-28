package gr.uaeb.cf.epanalipsi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferedReader {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder() ;
        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp1/info.txt"))){
            String line = "" ;
            while ((line=bf.readLine()) != null){
                sb.append(line).append("\n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(sb);
    }
}
