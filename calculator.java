package com.suarez;
import java.util.*;
//adapted from https://stackoverflow.com/questions/14675815/basic-calculator-in-java
/*
Aarian Dhanani
2/18/19
Run a simple calculator for the tablet
*/
public class calculator {
    public static void calc()
    {
        int opencalc = 1; //Sets the value to open so that it can be easily closed later on

        int integer1;
        int integer2;
        System.out.println("Welcome to text based integer calculator");
        while (opencalc == 1) //sets up so that once it is closed later, it can break from the while loop
        {
            Scanner numbers = new Scanner(System.in);

            //gets the integers
            System.out.println("Please enter the 1st integer value");
            integer1 = numbers.nextInt();
            System.out.println("Please enter the 2nd integer value");
            integer2 = numbers.nextInt();

            //allows the user to perform an operation
            System.out.println("Which operation would you like to perform? \n[1]addition\n[2]subtraction\n[3]multiplication\n[4]division");
            int choice;
            choice = numbers.nextInt();
            switch (choice){
                case 1:
                    System.out.println(integer1 + integer2);
                    break;
                case 2:
                    System.out.println(integer1 - integer2);
                    break;
                case 3:
                    System.out.println(integer1 * integer2);
                    break;
                case 4:
                    System.out.println(integer1 / integer2);
                    break;
                default:
                    System.out.println("Invalid operation!");
            }
            //Asks to see if the loop should be ran again
            System.out.println("Would you like to perform another operation?\n[1]Yes[2]No");
            choice = numbers.nextInt();
            switch (choice){
                case 1:
                    break;
                case 2:
                    System.out.println("You will now return to the main menu.");
                    opencalc = 0; //exits the loop and class
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
