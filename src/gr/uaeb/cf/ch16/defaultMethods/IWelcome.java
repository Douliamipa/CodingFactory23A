package gr.uaeb.cf.ch16.defaultMethods;

public interface IWelcome {
    void saySomething(String message);

    default  void sayHelloCodingFactory(){
        System.out.println("Hello ");
        sayCOdingFactory();

    }

    private void sayCOdingFactory(){
        System.out.println("Codig Factory");
    }

    static void sayHelloCoding(){
        System.out.println("Hello");
        sayCoding();
    }


    private static void  sayCoding(){
        System.out.println("Coding");
    }
}
