package Recursion;
public class Function{
    public static void main(String[] args) {
        message();
    }
    // function
    static void message(){
        System.out.println("Hi all..!");
        message1();
    }
    static void message1(){
        System.out.println("Hi all..!");
        message2();
    }
    static void message2(){
        System.out.println("Hi all..!");
        message3();
    }
    static void message3(){
        System.out.println("Hi all..!");
        message4();
    }
    static void message4(){
        System.out.println("Hi all..!");
    }
}