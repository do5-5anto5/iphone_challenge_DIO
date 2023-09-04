package model.apps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.App;
import model.entities.Contact;

public class Phone implements App {

	private Map<String, Contact> contactsBook = new HashMap<>();

	public Phone() {
		start();
	}

	public void addContact(String name, Integer number) {

		contactsBook.put(name, new Contact(name, number));
		System.out.println(name + " added to contacts.");
		simulateTimeCharge();
	}

	public void removeContact(String name) {
		if (!contactsBook.isEmpty()) {
			if (isAble(name)) {
				contactsBook.remove(name);
				System.out.println(name + " removed from book.\n");
			simulateTimeCharge();
			}
			else {
				System.out.println(name + " is not in your contacts list.\n");
				simulateTimeCharge();
			}
		} else {
			System.out.println("Empty List.\n");
			simulateTimeCharge();
		}
	}

	public void researchContactByName(String name) {
		if (!contactsBook.isEmpty()) {
			if (isAble(name)) {
			System.out.println(name + ", " + contactsBook.get(name) + "\n");
			simulateTimeCharge();
			}
			else {
				System.out.println(name + " is not in your contacts list.\n");
				simulateTimeCharge();
			}
		} else {
			System.out.println("Empty List.\n");
			simulateTimeCharge();
		}
	}

	public void showContacts() {
		if (!contactsBook.isEmpty()) {
			System.out.println("\nAll contacts:\n");
			for (String key : contactsBook.keySet()) {
				System.out.println(key + ", " + contactsBook.get(key) + "\n");
				simulateTimeCharge();
			}
 		} else {
			System.out.println("Empty List.\n");
			simulateTimeCharge();
		}
	}

	public void phoneCall(String name) {
		if(!contactsBook.isEmpty()) {
		if (isAble(name)) {
			for (String key : contactsBook.keySet()) {
				if (key == name) {
					System.out.println("Calling " + name + " - " + contactsBook.get(name) + "\n");
					simulateTimeCharge();
					break;
				}
			}
		}
		else {
		System.out.println(name + " is not in your list\n");
		simulateTimeCharge();
		}
		}
		else {
			System.out.println(name + " is not in your contacts book.");
			simulateTimeCharge();
		}
	}

	public void phoneAnswer(String name) {
		
		try (Scanner input = new Scanner(System.in)){
			System.out.println(contactsBook.get(name)
					+ " is calling you. Answer?");
			String answer = input.next();
			if (answer.toUpperCase() == "YES" || answer.toUpperCase() == "Y") {
				System.out.println("You did, enjoy.");
				simulateTimeCharge();
			}
			else {
				startVoiceMail(name);
				simulateTimeCharge();
			}
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	private void startVoiceMail(String name) {
		System.out.println(contactsBook.get(name) + " is leaving a voice mail to you.");
		simulateTimeCharge();
	}

	private boolean isAble(String name) {
		return contactsBook.containsKey(name);
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
