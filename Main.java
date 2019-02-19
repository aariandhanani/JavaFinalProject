package com.suarez;

import java.util.Scanner;

/*
Aarian Dhanani
2/18/19
Main area of the "tablet". This is where all of the classes are called and ran.
*/

public class Main {
    public static void main(String[] args) {
        //Variable Setup:

        int on = 1;

        //1 time on open

        System.out.println("Welcome to your Tablet");
        login first = new login();
        first.password();

        //Master Menu Controller

        while (on == 1) //continues looping the program
        {

            System.out.println("Welcome to the main menu. Please enter which application you would like to open: \n[1]settings \n[2]calculator \n[3]contacts \n[4]app store \n[5]other apps");

            Scanner choose = new Scanner(System.in);
            int choice = choose.nextInt();
            switch(choice) //switch statement for all of the central classes
            {
                case 1:
                    runSettings();
                    break;
                case 2:
                    runcalculator();
                    break;
                case 3:
                    runcontacts();
                    break;
                case 4:
                    runappstore();
                    break;
                case 5:
                    runotherapps();
                    break;
                default: System.out.println("Invalid input!");
            }
        }
    }

    //Running programs in the switch statement for organization purposes

    public static void runSettings()
    {
        settings first = new settings();
        first.settingsopen();
    }
    public static void runcalculator()
    {
        calculator second = new calculator();
        second.calc();
    }
    public static void runappstore()
    {
        appstore third = new appstore();
        third.appinstall();
    }
    public static void runotherapps()
    {
        otherapps second = new otherapps();
        second.appsopen();
    }
    public static void runcontacts()
    {
        contactsclass second = new contactsclass();
        second.maincontacts();
    }
}