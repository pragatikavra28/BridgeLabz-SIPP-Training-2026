import java.util.Scanner;

public class SimpleInterest {
    static double calculateSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();

        double si = calculateSI(principal, rate, time);
        System.out.printf(
            "The Simple Interest is %.2f for Principal %.2f,"
            + " Rate of Interest %.2f and Time %.2f%n",
            si, principal, rate, time
        );
    }
}