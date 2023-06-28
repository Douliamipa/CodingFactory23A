package gr.uaeb.cf.ch17.callback;

public class KinghtApp {
    public static void main(String[] args) {
        IKnight kingArthur = new Knight();
        IKnight saintGeorge = new Knight();

//        Lamda Expressions
//        kingArthur.embarkOnMission(()-> System.out.println("Save the Princes"));
//        saintGeorge.embarkOnMission(() -> killTheDragon());


        //Method references
        kingArthur.embarkOnMission(KinghtApp::killTheDragon);
        saintGeorge.embarkOnMission(KinghtApp::saveThePrincess);
    }

    public  static void  killTheDragon(){
        System.out.println("Kill the dragon");
    }

    public static void saveThePrincess(){
        System.out.println("Save the Princess");
    }
}
