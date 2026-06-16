import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Find youngest
        int youngestIndex = 0;
        for (int i = 1; i < age.length; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find tallest
        int tallestIndex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("\nYoungest friend: " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        System.out.println("Tallest friend: " + names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");
    }
}