import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

class Players {
    static ArrayList<String> initializePlayers() {
        Scanner ScanInit = new Scanner(System.in); // Create a Scanner object
        Scanner ScanInit2 = new Scanner(System.in);

        System.out.println("Enter Number of players");
        int numPLayers = ScanInit.nextInt();  // Read number of players
        ArrayList<String> player = new ArrayList<>(); //List of players
        for (int i = 1; i <= numPLayers; i++){
            System.out.println("Enter Name of Player " + i);
            player.add(ScanInit2.nextLine());
        }
        System.out.println(player);
        return player;
    }
    /*public static void main(String[] args) {
        initializePlayers();

    }*/

}