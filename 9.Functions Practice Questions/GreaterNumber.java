public class GreaterNumber {
    public static void main(String[] args) {
        int num1 = 5; // Change this value to the first number
        int num2 = 8; // Change this value to the second number
        int greater = findGreaterNumber(num1, num2);
        System.out.println("Greater number: " + greater);
    }

    public static int findGreaterNumber(int num1, int num2) {
        return Math.max(num1, num2);
    }
}
