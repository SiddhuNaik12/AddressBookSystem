package com.bridgelabz.addressbook.main;

import java.util.Scanner;
import com.bridgelabz.addressbook.service.AddressBook;
public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\n--- Address Book Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Display Contacts");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    book.addContact();
                    break;

                case 2:
                    book.editContact();
                    break;

                case 3:
                    book.displayContacts();
                    break;

                case 4:
                    System.out.println("Thank You");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
	}

}
