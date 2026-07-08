import java.util.Scanner;

public class FirstLastOccurrence {

    static int firstOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            }

            else if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {

        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            }

            else if (arr[mid] < target)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int target = sc.nextInt();

        System.out.println("First Occurrence: " + firstOccurrence(arr, target));
        System.out.println("Last Occurrence: " + lastOccurrence(arr, target));
    }
}