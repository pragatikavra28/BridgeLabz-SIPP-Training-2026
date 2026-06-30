import java.util.*;

public class AttendanceTracker {
    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());

        if (!attendance.get(subject).contains(student)) {
            attendance.get(subject).add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " is already marked in " + subject);
        }
    }

    public static void displayAttendance() {
        for (String subject : attendance.keySet()) {
            System.out.println(subject + " -> " + attendance.get(subject));
            System.out.println("Total: " + attendance.get(subject).size());
        }
    }

    public static void main(String[] args) {
        markAttendance("Java", "Pragati");
        markAttendance("Java", "Unnati");
        markAttendance("Java", "Pragati");
        markAttendance("DSA", "Pragati");

        displayAttendance();
    }
}