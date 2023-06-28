package gr.uaeb.cf.ch17.cloneable;

public class Main {
    public static void main(String[] args) {

        City athens = new City("Athens");
        try {

            City athensClone = athens.clone();
            athensClone.setCityName("Paris");
            System.out.println(athens);
            System.out.println(athensClone);

            Trainee alice = new Trainee("alice " , athens);
            Trainee bob = alice.clone();
            bob.getCity().setCityName("London");

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
