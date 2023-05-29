package gr.uaeb.cf.ch7;

public class SubstringDemo {
    public static void main(String[] args) {
        String a = "Athens Uni of Economics and Bus";
        for(int i = 0 ; i<a.length() ;i++){
            System.out.print(a.substring(i,i+1));
        }
    }
}
