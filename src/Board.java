import java.util.Scanner;

public class Board {
    static int initializeBoard(){
        Scanner scanBoardSize = new Scanner(System.in);
        System.out.println("Enter Size of Board");
        int sizeBoard = scanBoardSize.nextInt();  // Number of Fields in game
        return sizeBoard;
    }
}
