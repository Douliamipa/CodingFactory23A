package gr.uaeb.cf.projects_dika_mou;

public class ProjectNum10 {

    public static void main(String[] args) {

        boolean[][] theatreSeats = new boolean[30][12];
        viewOfTheaterSeats(theatreSeats);
    }

    public static void viewOfTheaterSeats(boolean[][] theatreSeats){
        for (int i = 0 ; i < theatreSeats.length ; i ++){
            System.out.println(" ");
            for (int j = 0 ; j < theatreSeats[i].length ; j++){
                System.out.print(theatreSeats[i][j] + " ");
            }
        }
    }
    public static void book(char clumn , int row){

    }

}
