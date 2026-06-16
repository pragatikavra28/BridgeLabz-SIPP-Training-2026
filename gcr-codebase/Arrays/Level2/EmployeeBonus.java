import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        int i = 0;
        while (i < 10) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextInt();

            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Please re-enter.");
                i--; 
            }
            i++;
        }

        for (int j = 0; j < 10; j++) {
            double bonusRate = (yearsOfService[j] > 5) ? 0.05 : 0.02;
            bonus[j] = salary[j] * bonusRate;
            newSalary[j] = salary[j] + bonus[j];

            totalBonus += bonus[j];
            totalOldSalary += salary[j];
            totalNewSalary += newSalary[j];
        }

        System.out.println("\n--- Bonus Payout Report ---");
        for (int j = 0; j < 10; j++) {
            System.out.printf("Employee %d | Old Salary: %.2f | Bonus: %.2f | New Salary: %.2f%n",
                    j + 1, salary[j], bonus[j], newSalary[j]);
        }

        System.out.printf("%nTotal Bonus: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
    }
}