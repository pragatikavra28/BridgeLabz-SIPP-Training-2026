public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        int add = 0;
        int mul = 1;

        while (n > 0) {
            int lastDigit = n % 10;

            mul *= lastDigit;
            add += lastDigit;

            n /= 10;
        }

        return mul - add;
    }

    public static void main(String[] args) {
        int n1 = 234;
        int n2 = 4421;

        System.out.println(n1 + " -> " + subtractProductAndSum(n1));
        System.out.println(n2 + " -> " + subtractProductAndSum(n2));
    }
}