import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits using loop
        while (number != 0) {
            if (index == maxDigit) break;
            digits[index] = number % 10;  
            number = number / 10;
            index++;
        }

        int actualSize = index;

        // Find largest and second largest
        int largest = 0, secondLargest = 0;

        for (int i = 0; i < actualSize; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.print("Digits in array: ");
        for (int i = 0; i < actualSize; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}