import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " is Positive and ");
                if (numbers[i] % 2 == 0)
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last)
            System.out.println("First and last elements are Equal");
        else if (first > last)
            System.out.println("First element is Greater than last element");
        else
            System.out.println("First element is Less than last element");
    }
}