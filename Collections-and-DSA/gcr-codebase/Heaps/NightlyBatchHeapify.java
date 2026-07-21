/**
 * Scenario 2: Build a min-heap in-place from an array.
 */
class NightlyBatchHeapify {
    public static void buildHeap(int[] priorities) {
        int n = priorities.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDown(priorities, i, n);
        }
    }

    private static void siftDown(int[] arr, int i, int size) {
        while (true) {
            int smallest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && arr[left] < arr[smallest]) {
                smallest = left;
            }
            if (right < size && arr[right] < arr[smallest]) {
                smallest = right;
            }
            if (smallest == i) {
                return;
            }

            int tmp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = tmp;
            i = smallest;
        }
    }
}
