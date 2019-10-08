class Field{
    int number; //Since we have an array, we use numbers from there and don't need any additional thing
    String[] occupants;
    boolean winner = false;
    int steps = 0;  //Stays at this field, with snakes and ladders it changes

    static Field initalizeLadder(int i){
        for (int j = 2; j < )
        Field ladder = new Field();
        field.number = i;
        return field;
    }

    public class Snake{
        int steps = -5;
    }

    static Field initalizeField(int i){
        Field field = new Field();
        field.number = i;
        return field;
    }

    static Field initializeFirstField(int i){    //First Field as Object of Field, since I want to use ArrayList and they need to be of the same type
        Field Field1 = new Field();
        Field1.number = i;
        return Field1;
    }

    static Field initializeLastField(int i){ //Last Field with winner condition
        Field LastField = new Field();
        LastField.winner = true;
        LastField.number = i;
        return LastField;
    }
}