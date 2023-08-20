//chack the number using if else

import java.util.*;

public class ChackTwoNum {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Num is Equal");
        } else {
            if (a > b) {
                System.out.println("Num is Greater");
            } else {
                if (a < b) {
                    System.out.println("Num is Lesser");
                }
            }
        }
    }
}

// using else if
/* if (a == b) {
            System.out.println("Num is Equal");
        } else if (a > b) {
                System.out.println("Num is Greater");
            } else {
                if (a < b) {
                    System.out.println("Num is Lesser");
                }
            } 
*/
        