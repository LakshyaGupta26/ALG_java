import java.util.Scanner;

public class Area {
    public static double calcArea(double base, double height) {
        return base * height;
    }
    public static double calcArea(double d1, double d2, double c) {
        return c * d1 * d2;
    }
    public static double calcArea(double a, double b, double height_t, double c) {
        return c * (a + b) * height_t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = 0.5;
        System.out.println("Enter base and height of parallelogram: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Enter diagonals of Rhombus: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Enter parallel lines and height of trapezium ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double height_t = sc.nextDouble();

        System.out.println("Area of Parallelogram: " + calcArea(base, height));
        System.out.println("Area of Rhombus: " + calcArea(d1, d2, c));
        System.out.println("Area of Trapezium: " + calcArea(a, b, height_t, c));
    }
}
