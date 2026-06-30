import java.util.*;

public class EventEntrySystem {
    static HashSet<String> participants = new HashSet<>();

    public static void register(String email) {
        if (participants.add(email)) {
            System.out.println(email + " registered successfully.");
        } else {
            System.out.println("Duplicate registration not allowed.");
        }
    }

    public static void displayParticipants() {
        System.out.println("Registered Participants:");
        for (String email : participants) {
            System.out.println(email);
        }
        System.out.println("Total Attendees: " + participants.size());
    }

    public static void main(String[] args) {
        register("user1@gmail.com");
        register("user2@gmail.com");
        register("user1@gmail.com");

        displayParticipants();
    }
}