import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number you want to add :");
            int n = in.nextInt();

            if(n==0){
                break;
            }else{
                System.out.println("Press 0 to quit");
                sum+=n;
            }

        }
        System.out.println();
        System.out.println("sum of all numbers you have entered: "+sum);
    }
}
