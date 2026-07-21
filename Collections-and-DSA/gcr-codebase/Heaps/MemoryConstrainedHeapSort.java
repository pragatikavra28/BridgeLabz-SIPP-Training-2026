/**
 * Scenario 3: In-place heap sort in ascending order using a max-heap.
 */
class MemoryConstrainedHeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--) {
            siftDownMax(arr, i, n);
        }

        for (int end = n - 1; end > 0; end--) {
            int tmp = arr[0];
            arr[0] = arr[end];
            arr[end] = tmp;
            siftDownMax(arr, 0, end);
        }
    }

    private static void siftDownMax(int[] arr, int i, int size) {
        while (true) {
            int largest = i;
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size && arr[left] > arr[largest]) {
                largest = left;
            }
            if (right < size && arr[right] > arr[largest]) {
                largest = right;
            }
            if (largest == i) {
                return;
            }

            int tmp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = tmp;
            i = largest;
        }
    }
}
