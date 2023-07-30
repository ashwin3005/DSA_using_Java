import java.util.Scanner;
public class Saveetha {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Enter your second number: ");
        int m = in.nextInt();
        int ans = sumOfDigits(n)*m;
        System.out.println("------- Solution----------");
        System.out.println("\n");
        System.out.println(ans);
        System.out.println(sumOfDigits(ans));
    }
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n = n/10;
        }
        return sum;
    }
}
