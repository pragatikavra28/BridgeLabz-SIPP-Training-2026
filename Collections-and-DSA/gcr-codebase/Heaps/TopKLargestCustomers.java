import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Scenario 4: Keep only the top-k largest values in a bounded min-heap.
 */
class TopKLargestCustomers {
    public static List<Integer> topKLargest(int[] transactions, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int amount : transactions) {
            if (minHeap.size() < k) {
                minHeap.offer(amount);
            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }

        return new ArrayList<>(minHeap);
    }
}
