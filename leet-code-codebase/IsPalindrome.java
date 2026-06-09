public class IsPalindrome {

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        return x == rev || x == rev / 10;
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;

        System.out.println(num1 + " -> " + isPalindrome(num1));
        System.out.println(num2 + " -> " + isPalindrome(num2));
        System.out.println(num3 + " -> " + isPalindrome(num3));
    }
}