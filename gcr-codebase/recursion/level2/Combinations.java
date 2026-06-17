import java.util.ArrayList;

public class Combinations {

    static void generate(
            int[] arr,
            int k,
            int index,
            ArrayList<Integer> current) {

        if (current.size() == k) {

            System.out.println(current);

            return;
        }

        for (int i = index;
             i < arr.length;
             i++) {

            current.add(arr[i]);

            generate(
                    arr,
                    k,
                    i + 1,
                    current);

            current.remove(
                    current.size() - 1);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        generate(
                arr,
                2,
                0,
                new ArrayList<>());
    }
}