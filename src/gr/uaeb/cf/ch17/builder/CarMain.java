package gr.uaeb.cf.ch17.builder;

public class CarMain {
    public static void main(String[] args) {

       Car car = new  Car.Builder(123456789 ,"Porsche").build();
       Car car1 = new Car.Builder(987654321,"Ferrari")
                        .owner("Doulakos").horsePower(1000).build();


    }
}
