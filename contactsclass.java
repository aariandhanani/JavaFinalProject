package com.suarez;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.io.*;


/*
Aarian Dhanani
2/18/19
This is the main for the contacts. This is where the user interacts and can add contacts as well as view contacts.
*/

//adapted from https://stackoverflow.com/questions/21664677/creating-a-contact-list-with-java-and-object-oriented

public class contactsclass {
    public static ArrayList<Contact> contacts = new ArrayList<Contact>();


    public static void maincontacts()  {

        int contactson = 1;

        while (contactson == 1)
        {
            Scanner continuecontact = new Scanner(System.in);
            int adding = 0; //to add a new contact to the ArrayList

            Scanner contactInput = new Scanner(System.in);

            //main area
            System.out.println("What would you like to do?\n[1]View Contacts \n[2]Add Contacts\n[3]Export ALL Contacts (Append)\n[4]Return to the Main Menu");
            int choose = continuecontact.nextInt();
            switch (choose){
                case 1:
                    //view contacts
                    System.out.println("Here are your registered contacts: ");
                    for ( Contact x: contacts){
                        x.displayContact();
                    }
                    break;
                case 2:
                    //input contacts
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
                        System.out.println("New contact added: ");
                        contact.displayContact();
                        System.out.println("Would you like to enter another contact?\n[1]yes\n[2]no");
                        int cont = continuecontact.nextInt();
                        switch (cont) {
                            case 1:
                                break;
                            case 2:
                                System.out.println("You will now return to the contacts menu.");
                                adding = 0;
                                break;
                            default:
                                System.out.println("Invalid input!");
                        }
                    }
                    break;
                case 3:
                    exportcontact();
                    break;
                case 4:
                    System.out.println("You will now return to the main menu.");
                    contactson = 0;
                    break;
                default:
                    System.out.println("Invalid input!");
            }
        }

    }
    public static void exportcontact() {
        try
        {
            File contactsheet = new File("contactsheet.txt");
            FileWriter contactfile = new FileWriter(contactsheet, true);
            for ( Contact x: contacts){
                contactfile.write(x.contactlistsheet());
            }
            contactfile.close();
            System.out.println("Contacts exported");
        }
        catch (IOException ioe)
        {
            System.out.println("There are no contacts!");
        }
    }
}



