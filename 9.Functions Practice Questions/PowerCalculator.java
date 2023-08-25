import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base number (x): ");
        double x = scanner.nextDouble();
        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();
        double result = calculatePower(x, n);
        System.out.println(x + " raised to the power of " + n + " is " + result);
        scanner.close();
    }

    public static double calculatePower(double x, int n) {
        return Math.pow(x, n);
    }
}
