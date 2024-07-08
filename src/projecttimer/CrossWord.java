package projecttimer;

import java.util.Random;

public class CrossWord {
    public static void main(String[] args) {

        char[][] board = new char[20][20];

        for(int i=0; i<20; i++){
            for(int x=0; x<20; x++){
                char c = generateChar();
                board[i][x] = c;
            }
        }

        displayBoard(board);
    }

    private static char generateChar(){
//        int randomValue = (int)(Math.random() * 26);
        int randomValue = new Random().nextInt(26);
        return (char)(randomValue + 'A');
    }

    private static void displayBoard(char b[][]){
        for(int i=0; i<20; i++){
            for(int x=0; x<20; x++){
                System.out.print(b[i][x]+" ");
            }
            System.out.println();
        }
    }
}
