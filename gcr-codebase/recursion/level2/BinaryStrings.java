import java.util.Scanner;

public class BinaryStrings {

    static void generate(
            String current,
            int n) {

        if (current.length() == n) {

            System.out.println(current);

            return;
        }

        generate(current + "0", n);

        generate(current + "1", n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        int n = sc.nextInt();

        generate("", n);
    }
}