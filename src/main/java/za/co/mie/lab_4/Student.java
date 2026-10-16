package za.co.mie.lab_4;

public class Student {
    String name;
    String student_number;
    double mark;
    public Student(String name, String student_number, double mark){
        this.name = name;
        this.student_number = student_number;
        this.mark = mark;
    }
    public void display_details(){
        System.out.println("Person Name: " + this.name + "\nStudent Number: " + this.student_number + "\nMarks: " + this.mark);
    }
    public boolean has_passed(){
        return this.mark >= 50;
    }
}