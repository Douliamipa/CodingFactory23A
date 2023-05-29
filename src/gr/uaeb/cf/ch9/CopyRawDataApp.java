package gr.uaeb.cf.ch9;

import java.io.*;

public class CopyRawDataApp {
    public static void main(String[] args) {
        int b = 0 ;
        int count = 0 ;
        byte[] buffer = new byte[4096];


//
//        try(FileInputStream in = new FileInputStream("C:/tmp/v1.mp4");
//        FileOutputStream out = new FileOutputStream("C:/tmp/v1out.mp4")){
//            while ((b= in.read()) != -1 ){
//                out.write(b);
//                count++ ;
//            }
//        }catch(IOException e){
//            throw new RuntimeException();
//        }


        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(("C:/tmp/v1.mp4")));
           BufferedOutputStream out = new BufferedOutputStream(new  FileOutputStream("C:/tmp/v1out.mp4"))){
            while ((b= in.read(buffer)) != -1 ){
                out.write(buffer,0,b);
                count+=b ;
            }
        }catch(IOException e){
            throw new RuntimeException();
        }

    }
}
