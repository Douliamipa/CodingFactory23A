package gr.uaeb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioCopyApp {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("C:/tmp/v1.mp4");
        Path targetPath = Paths.get("C:/tmp.v3out.mp4");

        byte[] videoBytes;

        try {
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetPath , videoBytes);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
