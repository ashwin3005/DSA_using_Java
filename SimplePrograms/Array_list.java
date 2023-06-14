import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(19);                //adding elements
        arr.add(121);
        arr.add(9);
        System.out.println(arr);
        arr.set(1,55);                 // updating
        System.out.println(arr);

        // accesing an element
        System.out.println(arr.get(2));
    }
}