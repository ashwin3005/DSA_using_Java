package OOPS;

import javax.sound.midi.Soundbank;

public class Learning{
    public static void main(String[] args) {
        // Student ash;
        // ash = new Student();
        Student ash = new Student();
        System.out.println(ash.rno);
        Student random = new Student(17, "ABD", 100.0F);
        System.out.println(random.name);
    }
}
class Student{
    int rno;
    String name;
    float mark;

    // constructor 
    Student(){
        this.rno = 10;
        this.name = "Andrej";
        this.mark = 72.9f;
    }
    Student(int rno, String name, float mark){
        this.rno = rno;
        this.name = name;
        this.mark = mark;
    }
}