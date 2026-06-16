import java.util.Scanner;

public class NaturalNumberSum {

    static long sumRecursive(int n) {
        if (n == 1) return 1;
        return n + sumRecursive(n - 1);
    }

    static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (n > 0).");
            return;
        }

        long recursive = sumRecursive(n);
        long formula   = sumFormula(n);

        System.out.println("Sum (recursive) : " + recursive);
        System.out.println("Sum (formula)   : " + formula);
        System.out.println("Results match   : " + (recursive == formula));
    }
}
