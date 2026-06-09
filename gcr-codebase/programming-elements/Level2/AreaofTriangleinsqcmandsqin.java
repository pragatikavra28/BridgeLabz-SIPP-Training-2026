import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base = input.nextDouble();
        double height = input.nextDouble();

        double areaInSqCm = 0.5 * base * height;
        double areaInSqIn = areaInSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is "
                + areaInSqIn + " and sq cm is " + areaInSqCm);
    }
}