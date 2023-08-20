import java.util.*; 

public class InputAddition{
    public static void main(String[] args){
       //Taking Input
       Scanner sc = new Scanner(System.in); //creating object

       int a = sc.nextInt();
       int b = sc.nextInt();

       int sum = a + b;

       System.out.println("Sum = " + sum);
    }
}