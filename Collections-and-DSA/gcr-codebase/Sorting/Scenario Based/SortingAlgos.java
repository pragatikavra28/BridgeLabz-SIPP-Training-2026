import java.util.Arrays;

public class SortingAlgos {

    // Bubble Sort
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Insertion Sort
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] a = {5, 4, 3, 2, 1};

        bubbleSort(a);
        System.out.println("Bubble Sort: " + Arrays.toString(a));

        int[] b = {5, 4, 3, 2, 1};

        selectionSort(b);
        System.out.println("Selection Sort: " + Arrays.toString(b));

        int[] c = {5, 4, 3, 2, 1};

        insertionSort(c);
        System.out.println("Insertion Sort: " + Arrays.toString(c));
    }
}