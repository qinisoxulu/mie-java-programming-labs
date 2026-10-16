package za.co.mie.lab_2;

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

    public void display_results(){
        System.out.println(calculateMark());
    }
}
