package com.suarez;

import java.util.Scanner;
/*
Aarian Dhanani
2/18/19
The settings class where preferences can be changed.
*/

public class settings {
    public static void settingsopen() {

        //for easy exit later
        int settingson = 1;

        while (settingson == 1)
        {
            //allows user to choose which option they would like to go to
            System.out.println("Welcome to settings. Please enter which option you would like to open: \n[1]delete apps \n[2]change password \n[3]reset \n[4]return to home page");
            Scanner choice = new Scanner(System.in);
            int choices = choice.nextInt();
            switch (choices) {

                //allows the user to set the values in enabledDisabled to 0 if it is currently 1
                case 1:
                    System.out.println("Here is a list of your active 3rd party apps:");
                    enabledDisabled games = new enabledDisabled();
                    int game1 = games.higherlower;
                    int game2 = games.rockpaperscissors;
                    if (game1 == 1) {
                        System.out.println("Number Guessing Game\n");
                        System.out.println("Would you like to delete Number Guessing Game?\n[1]yes\n[2]no");
                        Scanner deleteorno = new Scanner(System.in);
                        int delete = deleteorno.nextInt();
                        switch (delete) {
                            case 1:
                                System.out.println("Game deleted!");
                                games.higherlower = 0;
                                break;
                            case 2:
                                System.out.println("Canceled");
                                break;
                            default:
                                System.out.println("Invalid input!");

                        }
                    }
                    if (game2 == 1) {
                        System.out.println("Rock Paper Scissors\n");
                        System.out.println("Would you like to delete Rock Paper Scissors?\n[1]yes\n[2]no");
                        Scanner deleteorno = new Scanner(System.in);
                        int delete = deleteorno.nextInt();
                        switch (delete) {
                            case 1:
                                System.out.println("Game deleted!");
                                games.rockpaperscissors = 0;
                                break;
                            case 2:
                                System.out.println("Canceled");
                                break;
                            default:
                                System.out.println("Invalid input!");

                        }
                    }
                    if (game1 != 1 && game2 != 1) {
                        System.out.println("No other apps are enabled! Visit the app store to install.\n");
                    }
                    break;

                //allows user to change the value of password that was originally set
                case 2:
                    login passwords = new login();
                    int passwordtest = passwords.password;

                    System.out.println("This area is password protected. Please enter your password to access.");
                    Scanner passcheck = new Scanner(System.in);
                    int passwordenter = 0;
                    int check = 0;
                    int chances = 3;

                    while (passwordtest != passwordenter) {
                        if (passwordenter == passwordtest)
                        {
                            passwordenter = passwordtest;
                        }
                        else
                        {
                            check--;
                            while (check == 0) {
                                if (chances != 0) {
                                    chances--;
                                    System.out.println("Incorrect password. You have " + (chances + 1) + " chances remaining!");
                                }
                                else{
                                    System.out.println("Password entry failure. Your device will now reset");
                                    System.exit(5);
                                }
                                passwordenter = passcheck.nextInt();
                                if (passwordenter == passwordtest)
                                {
                                    passwordenter = passwordtest;
                                    check++;
                                }
                            }
                        }
                    }
                    System.out.println("Password accepted");
                    login first = new login();
                    first.password();
                    System.out.println("Password changed!");
                    break;

                //allows user to reset their device (exits the entire program)
                case 3:
                    check = 0;
                    chances = 3;
                    int exit = 0;

                    login passwords2 = new login();
                    int passwordtest2 = passwords2.password;

                    System.out.println("This area is password protected. Please enter your password to access.");
                    int passwordenter2 = passwordtest2 + 1;

                    while (passwordenter2 != passwordtest2) {

                        Scanner passcheck2 = new Scanner(System.in);
                        passwordenter2 = passcheck2.nextInt();

                        while (check == 0) {
                            if (passwordenter2 == passwordtest2)
                            {
                                int reset = 0;

                                System.out.println("Are you sure you would like to reset?\n[1]yes\n[2]no");
                                Scanner resetcheck = new Scanner(System.in);
                                reset = resetcheck.nextInt();

                                if (reset == 1)
                                {
                                    System.exit(9);
                                }
                                else
                                {
                                    System.out.println("You will now be sent back to the settings menu");
                                    break;

                                }
                            }
                            if (chances != 0) {
                                chances--;
                                System.out.println("Incorrect password. You have " + (chances + 1) + " chances remaining!");
                                passwordenter2 = passcheck2.nextInt();
                            }
                            else{
                                System.out.println("Password entry failure. Your device will now reset and all data will be lost");
                                check++;
                                System.exit(2);
                            }
                        }
                        if (exit == 1)
                        {
                            System.exit(4);
                        }
                    }
                    break;

                //returns the user to the main menu
                case 4:
                    System.out.println("You will now return to the main menu.");
                    settingson = 0;
                    break;

                default: System.out.println("Invalid input!");
            }
        }
    }
}