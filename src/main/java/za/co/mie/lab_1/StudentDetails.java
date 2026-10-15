package za.co.mie.lab_1;

// Exercise 1.1
public class StudentDetails {
    public void displayStudentDetails(){
        String student_name = "Naledi";
        int age = 20;
        double avg_mark = 76.5;
        boolean is_registered = true;

        System.out.println("""
            Student Name: """ + student_name + """
            \nAge: """ + age + """
            \nAverage Mark: """ + avg_mark + """
            \nRegistered: """ + is_registered);
    }
}