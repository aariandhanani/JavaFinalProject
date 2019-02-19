package com.suarez;
import java.util.Scanner;
/*
Aarian Dhanani
2/18/19
Where the computer checks if the games are enabled and if playable, then the user can choose to play them.
*/


public class otherapps {
    public static void appsopen()
    {

        //calling values from enabledDisabled to check later if games are playable
        enabledDisabled games = new enabledDisabled();
        int game1 = games.higherlower;
        int game2 = games.rockpaperscissors;
        Scanner startgameorno = new Scanner(System.in);

        //checks which games are playable and allows user to play the enabled ones
        if (game1 == 1 && game2 ==1)
        {
            System.out.println("Number Guessing Game AND Rock Paper Scissors are enabled. Would you like to play one of them?\n[1]yes\n[2]no");
            int open = startgameorno.nextInt();
            if (open == 1){
                System.out.println("Which would you like to play?\n[1]Number Guessing Game\n[2]Rock Paper Scissors");
                int open2 = startgameorno.nextInt();
                switch (open2){
                    case 1:
                        System.out.println("Running Number Guessing Game.");
                        runhigherlower();
                        break;
                    case 2:
                        runrockpaperscissors();
                        break;
                    default:
                        System.out.println("Invalid input!");
                }
            }
            else{
                System.out.println("Canceled");
            }
        }
        //only if guessing game is enabled but not rock paper scissors
        else if (game1 == 1) {
            System.out.println("Number Guessing Game is enabled. Would you like to play?\n[1]yes\n[2]no");
            int open = startgameorno.nextInt();
            if (open == 1){
                runhigherlower();
            }
            else{
                System.out.println("Canceled");
            }
        }

        //only if guessing game is not enabled but rock paper scissors is
        else if (game2 == 1) {
            System.out.println("Rock Paper Scissors is enabled. Would you like to play?\n[1]yes\n[2]no");
            int open = startgameorno.nextInt();
            if (open == 1){
                runrockpaperscissors();
            }
            else{
                System.out.println("Canceled");
            }
        }

        //if both are disabled
        else if (game1 == 0 && game2 == 0) {
            System.out.println("No 3rd party apps have been installed. Please visit the app store to do so.");
        }
    }


//area where the classes are run
    public static void runhigherlower()
    {
        higherlower second = new higherlower();
        second.mainhigherlower();
    }

    public static void runrockpaperscissors()
    {
        rockpaperscissors first = new rockpaperscissors();
        first.runrockpaperscissors();
    }
}
