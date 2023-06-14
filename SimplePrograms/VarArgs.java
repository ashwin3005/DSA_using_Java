import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varIntFun(2,3,4,5,44,62,99,99);
        varStringFun("Ashwin","Kunal Shah","Jeswanth");
    }
    static void varIntFun(int... v){
        System.out.println(Arrays.toString(v));
    }
    static void varStringFun(String ... v){
        System.out.println(Arrays.toString(v));
    }
}
