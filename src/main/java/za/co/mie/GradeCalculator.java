package za.co.mie;

import jdk.swing.interop.SwingInterOpUtils;

public class GradeCalculator {
    float mark;
    public GradeCalculator(float p_mark){
        mark = p_mark;
    }

    public String calculateMark(){
        if (mark >= 0 && mark <= 100){
            return mark >= 80 ? "Distinction" :
                    (mark >= 70 ? "Merit" :
                            (mark >= 50 ? "Pass" : "Fail"));
        }
        return "Invalid Mark";
    }

    void displayResults(){
        System.out.println(calculateMark());
    }
}
