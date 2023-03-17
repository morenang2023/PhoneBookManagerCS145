package com.phonebook;
import java.util.Scanner;
public class TestClass {

    private static int position;

    public static void main(String[] args) {

        PhoneBookManager phoneBook = new PhoneBookManager();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Phone Book");
            System.out.println("1. Add Contact to Start");
            System.out.println("2. Add Contact to Middle");
            System.out.println("3. Add Contact to End");
            System.out.println("4. Delete Contact");
            System.out.println("5. Modify Contact");
            System.out.println("6. Display Contacts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    phoneBook.addContactToStart(firstName, lastName, city, address, phoneNumber);
                    break;
                case 2:
                    System.out.print("Enter First Name: ");
                    firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    lastName = sc.nextLine();
                    System.out.print("Enter City: ");
                    city = sc.nextLine();
                    System.out.print("Enter Address: ");
                    address = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phoneNumber = sc.nextLine();
                    System.out.print("Enter Reference Phone Number: ");
                    phoneBook.addContactToMiddle(firstName, lastName, city, address, phoneNumber, position);
                    break;
                case 3:
                    System.out.print("Enter First Name: ");
                    firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    lastName = sc.nextLine();
                    System.out.print("Enter City: ");
                    city = sc.nextLine();
                    System.out.print("Enter Address: ");
                    address = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    phoneNumber = sc.nextLine();
                    phoneBook.addContactToEnd(firstName, lastName, city, address, phoneNumber);
                    break;
                case 4:
                    System.out.print("Enter Phone Number: ");
                    phoneNumber = sc.nextLine();
                    phoneBook.deleteContact(phoneNumber);
                    break;
                case 5:
                    System.out.print("Enter the contact's First Name to modify: ");
                    firstName = sc.nextLine();
                    System.out.print("Enter the contact's Last Name to modify: ");
                    lastName = sc.nextLine();
                    System.out.print("Enter the new First Name: ");
                    String newFirstName = sc.nextLine();
                    System.out.print("Enter the new Last Name: ");
                    String newLastName = sc.nextLine();
                    System.out.print("Enter the new City: ");
                    String newCity = sc.nextLine();
                    System.out.print("Enter the new Address: ");
                    String newAddress = sc.nextLine();
                    System.out.print("Enter the new Phone Number: ");
                    String newPhoneNumber = sc.nextLine();
                    phoneBook.modifyContact(firstName, lastName, newFirstName, newLastName, newCity, newAddress, newPhoneNumber);
                    break;
                case 6:
                    phoneBook.displayContacts();
                    break;
                case 7:
                    System.out.println("Exiting the Phone Book");
                    break;
                default:
                    System.out.println("Invalid Choice. Please try again.");
                    break;
            }
        } while (choice != 7);
    }
}
