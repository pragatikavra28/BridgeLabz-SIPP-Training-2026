import java.util.Scanner;
class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("Maximum possible handshakes = " +
                handshakes);
    }
}