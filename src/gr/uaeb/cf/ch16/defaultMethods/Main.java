package gr.uaeb.cf.ch16.defaultMethods;

public class Main {
    public static void main(String[] args) {
        IWelcome welcome = new CodingFactory();
        welcome.sayHelloCodingFactory();
    }
}
