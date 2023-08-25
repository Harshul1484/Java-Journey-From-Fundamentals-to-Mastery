import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double circumference = calculateCircumference(radius);
        System.out.println("Circumference: " + circumference);
        scanner.close();
    }

    public static double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
