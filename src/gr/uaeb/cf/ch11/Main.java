package gr.uaeb.cf.ch11;

/**
 *
 * Driver Class
 */
public class Main {
    public static void main(String[] args) {
        Student alice = new  Student();
        Student bob = new Student(2 , "BOB", "D");

        System.out.println(Student.getStudentsCount());//etsi kaloume static methodous  me to full onoma tis methodou pou sumperilamvanei kai to onoma tis klasis opws edw


        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        System.out.println("Bob id " + bob.getId());
        System.out.println("Bob first name" + bob.getFirstName());
        System.out.println("Bob last name" + bob.getLastName());

        bob.setId(3);

        HelloUtil.sayHello();
    }
}
