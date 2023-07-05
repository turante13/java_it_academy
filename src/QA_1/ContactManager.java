package QA_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ContactManager {
    private List<Contact>
            contacts;

    public ContactManager() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contactToString(contact));
                System.out.println("-----------------------");
            }
        }
    }

    public Contact searchContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(name) || contact.getLastName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public List<Contact> searchContactsByPhoneNumber(String phoneNumber) {
        List<Contact> searchResults = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().contains(phoneNumber)) {
                searchResults.add(contact);
            }
        }
        return searchResults;
    }

    public void deleteContact(Contact contact) {
        contacts.remove(contact);
    }

    private String contactToString(Contact contact) {
        return "Name: " + contact.getFirstName() + " " + contact.getLastName() +
                "\nPhone: " + contact.getPhoneNumber() +
                "\nEmail: " + contact.getEmail();
    }
}
