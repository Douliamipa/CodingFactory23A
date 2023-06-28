package gr.uaeb.cf.askiseis.modelErgasia1;

public class UserCredentials {
    private long id ;
    private String password ;

    public UserCredentials(){}

    public UserCredentials(long id, String password) {
        this.id = id;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
