package gr.uaeb.cf.askiseis.modelErgasia1;

public class MainEngine {
    public static void main(String[] args) {
        User lakis = new User(45, "Lalakis" ,"Lakis" ) ;
        UserCredentials lakisInfo = new UserCredentials(45 , "Popipopipo") ;

        System.out.println("User " + lakis.getFirstname() +" " + lakis.getLastname() + "with id :" + lakis.getId());
        System.out.println("Has the password " + lakisInfo.getPassword());
    }
}
