package gr.uaeb.cf.ch2;

public class AddApp {
    public static void main(String[] args) {
        long num = 2_147_483_647;// katw paula xwrizei tis xiliades
        int num2 = 2;
        long result = 0 ;
        result = num + num2 ;
        System.out.println(result); //dinei lathos apotelesma logw overflow
    }
}
