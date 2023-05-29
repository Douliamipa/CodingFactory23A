package gr.uaeb.cf.ch8;

public class NullPointerExceptApp {
    public static void main(String[] args) {
        String s  = null ;
        if (s != null && s.equals("Coding") ){
            System.out.println("Bingo");
        }else {
            System.out.println("");
        }
    }
}
