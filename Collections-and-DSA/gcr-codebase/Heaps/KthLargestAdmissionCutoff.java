import java.util.PriorityQueue;

/**
 * Scenario 5: Find the k-th largest value with a bounded min-heap.
 */
class KthLargestAdmissionCutoff {
    public static int findKthLargest(int[] scores, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int score : scores) {
            if (minHeap.size() < k) {
                minHeap.offer(score);
            } else if (score > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(score);
            }
        }

        return minHeap.peek();
    }
}
