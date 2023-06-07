public class LearnString{
    public static void main(String[] args) {
        String name = "Mithun";   // name is reference variable,  "Mithun" is object.
        System.out.println(name);


        String a = "Seneca";
        String b = "Seneca";
        System.out.println(a==b);               //true
        String c = new String("Seneca");
        System.out.println(a==c);      //outside the string pool         //false

        System.out.println(a.equals(c)); // checking only the values        //true
    }
}


// Two concepts are crutial :

//                  > String pool
//                  > Immutability



// primitives are stored in stack, objects are stored in heap.