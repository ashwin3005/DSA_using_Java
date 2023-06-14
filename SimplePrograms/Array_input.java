import java.util.Arrays;
import java.util.Scanner;

public class Array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        // System.out.println(Arrays.toString(arr));\

        for(int num:arr){                           // enhanced for loop
            System.out.println(num);
        }
    }
}
