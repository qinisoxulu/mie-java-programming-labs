package za.co.mie.lab_2;

public class PassOrFail {
    float mark;
    public PassOrFail(float p_mark){
        mark = p_mark;
    }

    public String calculateMark(){
        if (mark >= 0 && mark <= 100){
            return (mark >= 50 ? "Pass" : "Fail");
        }
        return "Invalid Mark";
    }

    public void display_results(){
        System.out.println(calculateMark());
    }
}