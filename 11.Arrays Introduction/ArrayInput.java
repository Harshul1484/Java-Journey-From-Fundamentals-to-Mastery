import java.util.*;

public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
    
//loop for input        
for(int i=0; i<size; i++){
    numbers[i] = sc.nextInt();
}

//loop for output
        for(int i=0; i<size; i++){
        System.out.println(numbers[i]);
        }
    }
}
