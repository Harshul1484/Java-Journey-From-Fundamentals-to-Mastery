import java.util.*; 

public class EvenOdd{
    public static void main(String[] args){
       //Input
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

       if(a%2 == 0){
        System.out.println("Even");

        }else {
            System.out.println("Odd");
           }
    }
}