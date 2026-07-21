import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Scenario 6: Merge k sorted log sources with a min-heap.
 */
class MergeKSortedLogs {
    static class LogEntry {
        final long timestamp;
        final String message;

        LogEntry(long timestamp, String message) {
            this.timestamp = timestamp;
            this.message = message;
        }
    }

    public static List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> sources) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            long left = sources.get(a[0]).get(a[1]).timestamp;
            long right = sources.get(b[0]).get(b[1]).timestamp;
            return Long.compare(left, right);
        });

        for (int i = 0; i < sources.size(); i++) {
            if (!sources.get(i).isEmpty()) {
                minHeap.offer(new int[] {i, 0});
            }
        }

        List<LogEntry> merged = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int sourceIdx = top[0];
            int elemIdx = top[1];
            merged.add(sources.get(sourceIdx).get(elemIdx));

            if (elemIdx + 1 < sources.get(sourceIdx).size()) {
                minHeap.offer(new int[] {sourceIdx, elemIdx + 1});
            }
        }

        return merged;
    }
}
