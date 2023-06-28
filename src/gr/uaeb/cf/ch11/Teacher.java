package gr.uaeb.cf.ch11;

public class Teacher {
    private long id ;
    private String firstname ;
    private String lastname ;

    public  Teacher(){
//        id = 0 ;
//        firstname = null;
//        lastname = null ;

    }

    public Teacher(long id ,String firstname ,String lastname){
        this.id = id ;
        this.lastname = lastname ;
        this.firstname = firstname ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
