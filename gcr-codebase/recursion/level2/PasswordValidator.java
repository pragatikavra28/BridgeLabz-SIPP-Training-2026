import java.util.Scanner;

public class PasswordValidator {

    static boolean isValid(String password, int index) {

        if (index == password.length())
            return true;

        char ch = password.charAt(index);

        if (!Character.isLetterOrDigit(ch))
            return false;

        return isValid(password, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (isValid(password, 0))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }
}