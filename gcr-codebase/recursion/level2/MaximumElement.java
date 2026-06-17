public class MaximumElement {

    static int findMax(int[] arr, int index) {

        if (index == arr.length - 1)
            return arr[index];

        return Math.max(
                arr[index],
                findMax(arr, index + 1));
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 7, 40, 15};

        System.out.println(
                "Maximum = "
                        + findMax(arr, 0));
    }
}