package za.co.mie.lab_3;

public class StudentMarks {
    private int[] marks = {23, 45, 67, 67, 95};

    public int getTotal(){
        int total = 0;
        for (int mark : marks){ total += mark; }
        return total;
    }

    public int getAverage(){
        return marks.length > 0 ? getTotal() / marks.length : 0;
    }

    void displayTotal(){
        System.out.println(getTotal());
    }

    void displayAverage(){
        System.out.println(getAverage());
    }
}