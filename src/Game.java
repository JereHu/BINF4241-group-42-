import java.lang.reflect.Array;
import java.util.ArrayList;

public class Game {
    public static void main(String[] args){
        int sizeBoard = Board.initializeBoard();
        ArrayList<Field> fullBoard = new ArrayList<>();
        for (int i = 0; i < sizeBoard; i++){   //Make a Board with all regular Fields
            fullBoard.add(Field.initalizeField(i+1));
        }
        fullBoard.set(0, Field.initializeFirstField(1)); //sets first field
        fullBoard.set(sizeBoard - 1, Field.initializeLastField(sizeBoard)); //Sets Last field with winner condition

        ArrayList<String> player = Players.initializePlayers();

        for (Field i : fullBoard){
            System.out.println(i.number);
        }
    }
}
