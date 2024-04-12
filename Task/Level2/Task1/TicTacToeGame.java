package Internship;

import java.util.Scanner;

public class TicTacToeGame {

    public static void main(String[] args) {
        char[][] board = new char[3][3];
        board[0][0] = ' ';
        board[0][1] = ' ';
        board[0][2] = ' ';
        board[1][0] = ' ';
        board[1][1] = ' ';
        board[1][2] = ' ';
        board[2][0] = ' ';
        board[2][1] = ' ';
        board[2][2] = ' ';
        DisplayBoard(board);
        userInput(board);
        System.out.println("----------------------------");
        DisplayBoard(board);
    }
    public static void DisplayBoard(char[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                char charValue = board[i][j];
                System.out.print(charValue+"|");
            }
            System.out.println();
        }
    }
    public static boolean  isPlayerX(char[][] dumi ){
            for (int i = 0; i < 3; i++) {
                if (dumi[0][i] == 'X' && dumi[1][i] == 'X' && dumi[2][i] == 'X' || dumi[i][0] == 'X' && dumi[i][1] == 'X' && dumi[i][2] == 'X' ||
                        dumi[0][0] == 'X' && dumi[1][1] == 'X' && dumi[2][2] == 'X' || dumi[0][2] == 'X' && dumi[1][1] == 'X' && dumi[2][0] == 'X'){
                    return true;
                }
            }
        return false;
    }
    public static boolean isPlayerO(char[][] dumi){
        for (int i = 0; i < 3; i++) {
            if (dumi[0][i] == 'O' && dumi[1][i] == 'O' && dumi[2][i] == 'O' || dumi[i][0] == 'O' && dumi[i][1] == 'O' && dumi[i][2] == 'O' ||
                    dumi[0][0] == 'O' && dumi[1][1] == 'O' && dumi[2][2] == 'O' || dumi[0][2] == 'O' && dumi[1][1] == 'O' && dumi[2][0] == 'O'){
                return true;
            }
        }
        return false;
    }
    public static void userInput (char[][] Board){
        Scanner sc = new Scanner(System.in);
        boolean playTheGame = true;
        while (playTheGame){
            System.out.print("player X enter the index number : ");
            int index0 = sc.nextInt();
            int index1 = sc.nextInt();
            Board[index0][index1] = 'X' ;
            if (isPlayerX(Board)) {
                System.out.println("player X is the winner");
                playTheGame = false;
                return;
            }
            if (boardFull(Board))
            {
                System.out.println("it is draw");
                playTheGame = false;
                break;
            }
            DisplayBoard(Board);
            //player O moves
            System.out.print("player O enter the index number : ");
            int indexO0 = sc.nextInt();
            int indexO1 = sc.nextInt();
            Board[indexO0][indexO1] = 'O' ;
            if (isPlayerO(Board)) {
                System.out.println("player O is the winner");
                playTheGame = false;
                return;
            }
            if (boardFull(Board)){
                System.out.println("its a draw");
                playTheGame = false;
            }
            DisplayBoard(Board);
        }
    }
    public static boolean boardFull(char[][] board){
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board.length; j++) {
//                System.out.println("1"+j);
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
