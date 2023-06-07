package gr.uaeb.cf.projects_dika_mou;

import java.util.Scanner;

public class ProjectNum8 {
    public static Scanner in = new Scanner(System.in);
    public static  final  int players1pawn = 1;
    public static  final  int players2pawn = 2;
    public static void main(String[] args) {
        int[][] board = new int[3][3];
        int previusPlay = 0 ;

        for (int i = 0 ; i < board.length ; i++){
            for (int j = 0 ; j < board[i].length ; j++){
                board[i][j] = 0 ;
            }
        }



    }

    public static void areVictoryConditionsMet (int[][] board){
        if((board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)||(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1) ||(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
        ||(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1) || (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1) || (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1) || (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1)
        || (board[0][2] == 1 && board[1][0] == 1 && board[2][0] == 1)){
            System.out.println("Bingo Player 1 wins");
            System.out.println("The game ends now ");
            System.exit(0);
        } else if ((board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2)||(board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2) ||(board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2)
                ||(board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2) || (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2) || (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2) || (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2)
                || (board[0][2] == 2 && board[1][0] == 2 && board[2][0] == 2)) {
            System.out.println("Bingo player 2 wins");
            System.out.println("The game ends now ");
            System.exit(0);

        }
    }

    public static void  roundAnouncer(int previusPlay){
        if ( previusPlay == 1){
            System.out.println("Its player's numer 2 turn");
        }else {
            System.out.println("Its player's numer 1 turn");
        }
    }

    public static void setPreviusPlay(int previusPlay){
        if (previusPlay == 0){
            previusPlay = 1 ;
        }else if (previusPlay == 1){
            previusPlay = 2 ;
        }
    }
    public static int getPreviusplayer(int previusPlay){
        return previusPlay;
    }

    public static int[][] players1play (int[][] board , int previusPlay ){
        int choice = 0 ;
        boolean isPlayValid = false ;
        do {
            System.out.println("Where do you want to put your pawn");
            System.out.println("Press 1 if you want top left corner");
            System.out.println("Press 2 if you want top midle position");
            System.out.println("Press 3 if you want top right corner");
            System.out.println("Press 4 if you want midle left posotion");
            System.out.println("Press 5 if you want center position");
            System.out.println("Press 6 if you want midle right position");
            System.out.println("Press 7 if you want bottom left corner");
            System.out.println("Press 8 if you want bottom midle position");
            System.out.println("Press 9 if you want bottom right corner");

            choice = in.nextInt();

            switch (choice){
                case 1 :
                    if (board[0][0] == 0){
                        board[0][0] = 1;
                        isPlayValid = true ;
                    }else if (board[0][0] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 2 :
                    if (board[0][1] == 0){
                        board[0][1] = 1;
                        isPlayValid = true ;
                    }else if (board[0][1] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 3 :
                    if (board[0][2] == 0){
                        board[0][2] = 1;
                        isPlayValid = true ;
                    }else if (board[0][2] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 4 :
                    if (board[1][0] == 0){
                        board[1][0] = 1;
                        isPlayValid = true ;
                    }else if (board[1][0] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 5 :
                    if (board[1][1] == 0){
                        board[1][1] = 1;
                        isPlayValid = true ;
                    }else if (board[1][1] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 6 :
                    if (board[1][2] == 0){
                        board[1][2] = 1;
                        isPlayValid = true ;
                    }else if (board[1][2] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 7 :
                    if (board[2][0] == 0){
                        board[2][0] = 1;
                        isPlayValid = true ;
                    }else if (board[2][0] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 8 :
                    if (board[2][1] == 0){
                        board[2][1] = 1;
                        isPlayValid = true ;
                    }else if (board[2][1] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 9 :
                    if (board[2][2] == 0){
                        board[2][2] = 1;
                        isPlayValid = true ;
                    }else if (board[2][2] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                default :
                    System.out.println("Error in play ");





            }


        }while (!isPlayValid);
        setPreviusPlay(previusPlay);

        return board;
    }
    public static int[][] players2play (int[][] board , int previusPlay ){
        int choice = 0 ;
        boolean isPlayValid = false ;
        do {
            System.out.println("Where do you want to put your pawn");
            System.out.println("Press 1 if you want top left corner");
            System.out.println("Press 2 if you want top midle position");
            System.out.println("Press 3 if you want top right corner");
            System.out.println("Press 4 if you want midle left posotion");
            System.out.println("Press 5 if you want center position");
            System.out.println("Press 6 if you want midle right position");
            System.out.println("Press 7 if you want bottom left corner");
            System.out.println("Press 8 if you want bottom midle position");
            System.out.println("Press 9 if you want bottom right corner");

            choice = in.nextInt();

            switch (choice){
                case 1 :
                    if (board[0][0] == 0){
                        board[0][0] = 2;
                        isPlayValid = true ;
                    }else if (board[0][0] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 2 :
                    if (board[0][1] == 0){
                        board[0][1] = 2;
                        isPlayValid = true ;
                    }else if (board[0][1] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 3 :
                    if (board[0][2] == 0){
                        board[0][2] = 2;
                        isPlayValid = true ;
                    }else if (board[0][2] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 4 :
                    if (board[1][0] == 0){
                        board[1][0] = 2;
                        isPlayValid = true ;
                    }else if (board[1][0] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 5 :
                    if (board[1][1] == 0){
                        board[1][1] = 2;
                        isPlayValid = true ;
                    }else if (board[1][1] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 6 :
                    if (board[1][2] == 0){
                        board[1][2] = 2;
                        isPlayValid = true ;
                    }else if (board[1][2] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 7 :
                    if (board[2][0] == 0){
                        board[2][0] = 2;
                        isPlayValid = true ;
                    }else if (board[2][0] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 8 :
                    if (board[2][1] == 0){
                        board[2][1] = 2;
                        isPlayValid = true ;
                    }else if (board[2][1] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                case 9 :
                    if (board[2][2] == 0){
                        board[2][2] = 2;
                        isPlayValid = true ;
                    }else if (board[2][2] == 1){
                        System.out.println("Έχεισ ήδη πιόνι σε αυτή τη θεση διάλεξε κάποια άλλη θέση");
                    }else {
                        System.out.println("Ο αντίπαλός σου έχει πίόνι σε αυτή τη θέση διάλεξε κάποια άλλη");
                    }
                    break;

                default :
                    System.out.println("Error in play ");





            }


        }while (!isPlayValid);
        setPreviusPlay(previusPlay);

        return board;
    }

}
