package gr.uaeb.cf.ch11.model;

public class UserCredentials {
    private int userCedentailsId ;
    private String username ;
    private String password ;
    public UserCredentials(){}


    public int getUserCedentailsId() {
        return userCedentailsId;
    }

    public void setUserCedentailsId(int userCedentailsId) {
        this.userCedentailsId = userCedentailsId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
