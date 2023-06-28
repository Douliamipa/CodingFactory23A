package gr.uaeb.cf.askiseis;

public class User {
    private long id ;
    private String firstName ;
    private String lastName ;


    public User(){}

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void RegisterUser() {
        System.out.println("user is reggistered successfully ");

    }
}
