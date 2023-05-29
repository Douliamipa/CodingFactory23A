package gr.uaeb.cf.ch2;

public class RandomDieApp {
    public static void main(String[] args) {
        //(math random () * max-min+1)+min;
        int die = (int)(Math.random()*6)+1; //kanoume typecast se int
        System.out.println(die);
    }
}
