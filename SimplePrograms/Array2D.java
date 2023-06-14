import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];                   // Declaring 2D Array 
        System.out.print("Enter 9 integers: ");
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        for(int[] a:arr){                               // enhanced for loop for arraya
            System.out.println(Arrays.toString(a));
        }
    }
}
