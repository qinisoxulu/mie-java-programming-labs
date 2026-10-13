package za.co.mie;

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

    void displayResults(){
        System.out.println(calculateMark());
    }
}