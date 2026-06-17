import java.util.Scanner;

public class TowerOfHanoi {

    static void solve(
            int n,
            char source,
            char helper,
            char destination) {

        if (n == 1) {

            System.out.println(
                    "Move disk 1 from "
                            + source
                            + " to "
                            + destination);

            return;
        }

        solve(
                n - 1,
                source,
                destination,
                helper);

        System.out.println(
                "Move disk "
                        + n
                        + " from "
                        + source
                        + " to "
                        + destination);

        solve(
                n - 1,
                helper,
                source,
                destination);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Disks: ");
        int n = sc.nextInt();

        solve(n, 'A', 'B', 'C');
    }
}