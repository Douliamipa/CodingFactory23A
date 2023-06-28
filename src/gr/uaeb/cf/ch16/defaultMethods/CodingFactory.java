package gr.uaeb.cf.ch16.defaultMethods;

public class CodingFactory implements IWelcome{
    @Override
    public void saySomething(String message) {
        System.out.println("Please get the message "+ message);

    }

    @Override
    public void sayHelloCodingFactory() {
        IWelcome.super.sayHelloCodingFactory();

        System.out.println("\u2764".repeat(5));
    }
}
