import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class

class Players {
    private static void initializePlayers() {
        Scanner ScanInit = new Scanner(System.in); // Create a Scanner object
        Scanner ScanInit2 = new Scanner(System.in);// Create a 2nd Scanner Object for name of player

        System.out.println("Enter Number of players:");
        int numPLayers = ScanInit.nextInt();// Read number of players

        while (numPLayers < 2 || numPLayers > 4) { //if numbers of players false, it asks again until true
            System.out.println("Number of players needs to be between 2 and 4!");
            System.out.println("Enter Number of players:");
            numPLayers = ScanInit.nextInt();// Read number of players again
        }

        ArrayList<String> player = new ArrayList<>(); //List of players
        for (int i = 1; i <= numPLayers; i++){
            System.out.println("Enter Name of Player " + i);
            player.add(ScanInit2.nextLine());
        }
        System.out.println(player);

    }
    public static void main(String[] args) {
        initializePlayers();

    }

}