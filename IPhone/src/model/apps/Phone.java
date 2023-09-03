package model.apps;

import java.util.Map;

import model.App;
import model.entities.Contact;

public class Phone implements App {

	private Map<String, Contact> contactsBook;

	public Phone() {
		start();
	}

	public void addContact(String name, Integer number) {
		Contact contact = null;
		contactsBook.put(name, contact);
	}

	public void removeContact(String name) {
		if (!contactsBook.isEmpty()) {
			contactsBook.remove(name);
			System.out.println(name + " removed from book.");
		} else {
			System.out.println("Empty List.");
		}
	}

	public void researchContactByName(String name) {
		if (!contactsBook.isEmpty()) {
			System.out.println(name + ", " + contactsBook.get(name));
		} else {
			System.out.println("Empty List.");
		}
	}

	public void showContacts() {
		System.out.println("\nAll contacts:\n");
		for (String key : contactsBook.keySet()) {
			System.out.println(key + ", " + contactsBook.get(key));
		}
	}

	public void phoneCall(String name) {

		System.out.println("Calling " + name + " - " + contactsBook.get(name));

		simulateTimeCharge();
	}

	public void phoneAnswer(int number) {

	}

	private void startVoiceMail(String name) {
		System.out.println(contactsBook.get(name) + " is leaving a voice mail to you.");
	}

	@Override
	public void start() {
		System.out.println("Starting Phone.");
	}

	@Override
	public void close() {
		System.out.println("Closing Phone.\n");
	}
}
