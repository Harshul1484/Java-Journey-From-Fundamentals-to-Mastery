public class SumOfOddNumbers {
    public static void main(String[] args) {
        int n = 10; 
        int sum = calculateSumOfOddNumbers(n);
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }

    public static int calculateSumOfOddNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }
}
