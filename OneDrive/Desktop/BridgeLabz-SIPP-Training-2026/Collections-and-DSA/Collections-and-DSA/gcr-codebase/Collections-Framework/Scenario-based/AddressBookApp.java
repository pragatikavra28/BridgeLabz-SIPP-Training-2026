import java.util.*;

class Contact {
    String name, phone, email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookApp {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    public static void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Phone number already exists!");
            return;
        }
        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);
    }

    public static void searchContact(String name) {
        if (contactMap.containsKey(name)) {
            Contact c = contactMap.get(name);
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        } else {
            System.out.println("Contact not found!");
        }
    }

    public static void deleteContact(String name) {
        Contact c = contactMap.remove(name);
        if (c != null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact deleted.");
        }
    }

    public static void displayContacts() {
        contacts.sort((a, b) -> a.name.compareToIgnoreCase(b.name));
        for (Contact c : contacts) {
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        }
    }

    public static void main(String[] args) {
        addContact("Pragati", "9876543210", "pragati@mail.com");
        addContact("Unnati", "9123456780", "unnati@mail.com");

        searchContact("Pragati");
        displayContacts();
        deleteContact("Unnati");
    }
}