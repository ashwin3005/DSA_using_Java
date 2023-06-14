import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temprature in celsius: ");
        float tempC = in.nextFloat();
        System.out.println("celsius is equal to "+(tempC*9/5+(32)+" Farenheat."));

    }
}
