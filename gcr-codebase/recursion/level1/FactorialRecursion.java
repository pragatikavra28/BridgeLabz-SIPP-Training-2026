import java.util.Scanner;

public class FactorialRecursion {

    static long factorial(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(
                "Factorial = "
                        + factorial(n));
    }
}