import java.util.Scanner;

public class DiscountFeeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();
        double discount = fee * discountPercent / 100;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + discountedFee);
        input.close();
    }
}