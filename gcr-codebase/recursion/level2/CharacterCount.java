import java.util.Scanner;

public class CharacterCount {

    static int countChar(
            String text,
            char target,
            int index) {

        if (index == text.length())
            return 0;

        if (text.charAt(index) == target)
            return 1 + countChar(
                    text,
                    target,
                    index + 1);

        return countChar(
                text,
                target,
                index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        System.out.print("Enter Character: ");
        char ch = sc.next().charAt(0);

        System.out.println(
                "Count = "
                        + countChar(
                        text,
                        ch,
                        0));
    }
}