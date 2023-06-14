public class ReverseOfNum {
    public static void main(String[] args) {
        int n = 654321;
        int rev = 0; 
        int digit = 10;
        while(n>0){
            int rem = n%10; // last digit
            n = n/10;
            rev = rev*digit + rem;
        }
        System.out.println(rev);
    }
}
