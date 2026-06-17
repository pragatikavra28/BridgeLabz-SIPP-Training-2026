import java.util.Scanner;

public class ReverseString {

    static String reverse(String str) {

        if (str.isEmpty())
            return str;

        return reverse(str.substring(1))
                + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println(
                "Reversed = "
                        + reverse(str));
    }
}