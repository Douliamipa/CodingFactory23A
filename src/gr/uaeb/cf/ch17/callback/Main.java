package gr.uaeb.cf.ch17.callback;

public class Main {
    public static void main(String[] args) {
        IKnight sirLancelot = new Knight();
        IKnight kingArthur = new Knight();

        sirLancelot.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                System.out.println("Save thr Princess ");
            }
        });

        kingArthur.embarkOnMission(new IMission() {
            @Override
            public void embark() {
                killTheDragon();
            }
        });
    }

    public static void killTheDragon(){
        System.out.println("Kill the dragon");
    }
}
