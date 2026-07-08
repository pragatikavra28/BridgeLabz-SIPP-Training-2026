public class CountingSort {

    static void countingSort(int[] arr) {

        // Find maximum element
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Build sorted array
        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {
                arr[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {4, 2, 2, 8, 3, 3, 1};

        countingSort(arr);

        System.out.println("Sorted Array:");

        for (int x : arr)
            System.out.print(x + " ");
    }
}