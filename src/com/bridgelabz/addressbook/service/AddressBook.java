package com.bridgelabz.addressbook.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import com.bridgelabz.addressbook.model.Contact;

public class AddressBook {
	ArrayList<Contact> contacts = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	// UC2 - Add Contact
	public void addContact() {

		System.out.print("First Name: ");
		String firstName = sc.next();

		System.out.print("Last Name: ");
		String lastName = sc.next();

		System.out.print("Address: ");
		String address = sc.next();

		System.out.print("City: ");
		String city = sc.next();

		System.out.print("State: ");
		String state = sc.next();

		System.out.print("Zip: ");
		String zip = sc.next();

		System.out.print("Phone: ");
		String phone = sc.next();

		System.out.print("Email: ");
		String email = sc.next();

		Contact contact = new Contact(
				firstName, lastName, address,
				city, state, zip, phone, email);

		contacts.add(contact);
		System.out.println("Contact Added Successfully");
	}
	// UC3 - Edit Contact
	public void editContact() {

		System.out.print("Enter First Name to Edit: ");
		String name = sc.next();

		for (Contact c : contacts) {
			if (c.getFirstName().equalsIgnoreCase(name)) {

				System.out.print("Enter New Address: ");
				c.setAddress(sc.next());

				System.out.print("Enter New Phone: ");
				c.setPhone(sc.next());

				System.out.println("Contact Updated Successfully");
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

	// UC4 – Delete Contact
	public void deleteContact() {
		System.out.print("Enter First Name to Delete: ");
		String name = sc.next();

		Iterator<Contact> it = contacts.iterator();
		while (it.hasNext()) {
			if (it.next().getFirstName().equalsIgnoreCase(name)) {
				it.remove();
				System.out.println("Contact Deleted");
				return;
			}
		}
		System.out.println("Contact Not Found");
	}

	// UC5 – Display Multiple Contacts
	public void displayContacts() {
		if (contacts.isEmpty()) {
			System.out.println("No Contacts Available");
			return;
		}
		for (Contact c : contacts) {
			System.out.println(c);
		}
	}
}
