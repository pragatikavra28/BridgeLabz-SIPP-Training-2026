import java.util.Scanner;

public class TriangleRounds {
    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distanceMeters = 5000;
        return distanceMeters / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double c = sc.nextDouble();

        double rounds = calculateRounds(a, b, c);
        System.out.printf(
            "The athlete must complete %.2f rounds to finish a 5 km run.%n",
            rounds
        );
    }
}