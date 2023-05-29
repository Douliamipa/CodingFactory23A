package gr.uaeb.cf.ch8;

import java.util.Optional;

public class OptionalAPP {
    public static void main(String[] args) {
        String s ="AUEB";
        String copied =null ;


        Optional<String> str = getStrCopy(s);

        if (str.isPresent()){
            copied= str.get();
        }

        System.out.println(copied);
    }

    public static String getCopy(String s){
        return s;
    }

    public static Optional<String> getStrCopy(String s ){
        return Optional.ofNullable(s);
    }
}
