import java.util.PriorityQueue;

/**
 * Scenario 1: Real-time ER triage queue.
 * Max-heap by severity so the most severe patient is always at the root.
 */
class EmergencyRoomTriageQueue {
    static class Patient {
        final String name;
        final int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    private final PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> Integer.compare(b.severity, a.severity));

    public void addPatient(Patient patient) {
        triageQueue.offer(patient);
    }

    public Patient treatNext() {
        return triageQueue.poll();
    }

    public Patient peekNext() {
        return triageQueue.peek();
    }

    public int size() {
        return triageQueue.size();
    }
}
