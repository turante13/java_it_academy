package QA_1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static final Scanner
            scanner =
            new Scanner(System.in);
    private static final ContactManager
            contactManager =
            new ContactManager();

    public static void main(String[] args) {
        boolean
                running =
                true;
        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Search Contacts by Phone Number");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int
                    choice =
                    scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
//                    addContact();
//                    break;
//                case 2:
//                    displayContacts();
//                    break;
//                case 3:
//                    searchContactByName();
//                    break;
//                case 4:
//                    searchContactsByPhoneNumber();
//                    break;
//                case 5:
//                    deleteContact();
//                    break;
                case 6:
                    running =
                            false;
                    break;
            }
        }
    }
}