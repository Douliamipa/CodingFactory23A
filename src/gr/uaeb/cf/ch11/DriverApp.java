package gr.uaeb.cf.ch11;

public class DriverApp {

    public static void main(String[] args) {
        Teacher alice = new Teacher() ;
        alice.setId(1);
        alice.setFirstname("Alice");
        alice.setLastname("W.");

        System.out.println("id :" +alice.getId());
        System.out.println("First name :" + alice.getFirstname());
        System.out.println("Last name :" + alice.getLastname());
    }
}
