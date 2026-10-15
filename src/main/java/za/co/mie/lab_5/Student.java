package za.co.mie.lab_5;

public class Student {
    private static final int NUMBER_OF_MARKS = 3;

    private String student_number;
    private String name;
    private int[] marks;

    public Student(String p_studentNumber, String p_name, int[] p_marks){
        if (p_marks == null || p_marks.length != NUMBER_OF_MARKS){
            throw new IllegalArgumentException("A student needs exactly " + NUMBER_OF_MARKS + " marks");
        }
        for (int mark : p_marks){
            if (mark < 0 || mark > 100){
                throw new IllegalArgumentException("Invalid mark " + mark + ": marks must be between 0 and 100");
            }
        }
        this.student_number = p_studentNumber;
        this.name = p_name;
        this.marks = p_marks;
    }

    public String get_name(){
        return name;
    }

    public double calculate_average(){
        int total = 0;
        for (int mark : marks){
            total += mark;
        }
        return (double) total / marks.length;
    }

    public boolean has_passed(){
        return calculate_average() >= 50;
    }

    public void display_summary(){
        System.out.println("Student number: " + this.student_number);
        System.out.println("Name: " + this.name);
        System.out.print("Marks:");
        for (int mark : this.marks){
            System.out.print(" " + mark);
        }
        System.out.println();
        System.out.printf("Average: ", calculate_average());
        System.out.println();
        System.out.println("Result: " + (has_passed() ? "Pass" : "Fail"));
    }
}