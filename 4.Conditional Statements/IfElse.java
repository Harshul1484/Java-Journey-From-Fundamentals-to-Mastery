import java.util.*; 

public class IfElse{
    public static void main(String[] args){
       //Input
       Scanner sc = new Scanner(System.in);

       int age = sc.nextInt();
       
       if (age > 18) {
       System.out.println("Adult");
    
       } else {
        System.out.println("not an adult");
       }
    }
}