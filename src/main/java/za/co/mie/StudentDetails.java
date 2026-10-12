package za.co.mie;

public class StudentDetails {
    String student_name;
    int age;
    double avg_mark;
    boolean is_registered;

    public void printStudentDetails(){
        student_name = "Naledi";
        age = 20;
        avg_mark = 76.5;
        is_registered = true;

        System.out.println("""
            Student Name: """ + student_name + """
            \nAge: """ + age + """
            \nAverage Mark: """ + avg_mark + """
            \nRegistered: """ + is_registered);
    }
}