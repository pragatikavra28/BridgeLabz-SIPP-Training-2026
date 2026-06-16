import java.util.Scanner;

public class FactorAnalysis {

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;
        return factors;
    }

    static long findSum(int[] factors) {
        long sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    static long findProduct(int[] factors) {
        long product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    static double findSumOfSquares(int[] factors) {
        double sumSq = 0;
        for (int f : factors) sumSq += Math.pow(f, 2);
        return sumSq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum of factors       : " + findSum(factors));
        System.out.println("Product of factors   : " + findProduct(factors));
        System.out.println("Sum of squares       : " + findSumOfSquares(factors));
    }
}