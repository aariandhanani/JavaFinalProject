package com.suarez;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
/*
Aarian Dhanani
2/18/19
This is the main for the contacts. This is where the user interacts and can add contacts as well as view contacts.
*/

//adapted from https://stackoverflow.com/questions/21664677/creating-a-contact-list-with-java-and-object-oriented and https://www.geeksforgeeks.org/convert-an-arraylist-of-string-to-a-string-array-in-java/

public class contactsclass {
    public static ArrayList<Contact> contacts = new ArrayList<Contact>();


    public static void maincontacts() {

        Scanner continuecontact = new Scanner(System.in);
        int adding = 0; //to add a new contact to the ArrayList

        Scanner contactInput = new Scanner(System.in);

        //view contacts:
        System.out.println("Would you like to view contacts?\n[1]yes\n[2]no");
        int check = continuecontact.nextInt();
        switch (check) {
            case 1:
//                Contact contact2 = new Contact()
//                    @Override
//                    contact2.displayContact();
                  //  super.displayContact();

               // System.out.println(contact2);
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid input!");
        }

        //input contacts:
        System.out.println("Would you like to enter a new contact?\n[1]yes\n[2]no");
        int enternew = continuecontact.nextInt();
        switch (enternew) {
            case 1:
                adding = 1;
                break;
            case 2:
                System.out.println("You will now return to the main menu.");
                break;
            default:
                System.out.println("Invalid input!");
        }
        while (adding == 1) //if said yes to add a new contact
        {

            //Takes in name and email
            System.out.println("Please enter the first name: ");
            String name = contactInput.nextLine();
            System.out.println("Please enter the email address: ");
            String email = contactInput.nextLine();

            //Adds the new contact to the ArrayList
            Contact contact;
            contact = new completeContact(name, email);
            contacts.add(contact);
            contact.displayContact();
            System.out.println(contacts);
            System.out.println("Would you like to enter another contact?\n[1]yes\n[2]no");
            int cont = continuecontact.nextInt();
            switch (cont) {
                case 1:
                    break;
                case 2:
                    System.out.println("You will now return to the main menu.");
                    adding = 0;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
//    public static void printContact()
//    {
//
//        for(int j = 0; j < contacts.size(); j++)
//        {
//            str[j] = contacts.get(j);
//        }
//    }
}



