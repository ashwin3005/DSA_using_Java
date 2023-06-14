import java.util.Arrays;

public class Scope {
    public static void main(String[] args) {
        int a  =  10;               //primitive
        int[] arr = {78,32,43};     //non-primitive
        mutate(a);
        change(arr);
        System.out.println(a);
        System.out.println(Arrays.toString(arr));
    }
    static void mutate(int num){
        num = num+1;
    }
    static void change(int[] args){
        args[1] = 62;
    }
}
