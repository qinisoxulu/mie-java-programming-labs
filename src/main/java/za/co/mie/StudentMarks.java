package za.co.mie;

import java.util.ArrayList;

public class StudentMarks {
    private ArrayList<Integer> marks = new ArrayList<Integer>();

    public StudentMarks(){
        addMark();
    }

    private void addMark(int p_mark){
        marks.add(p_mark);
    }

    private void addMark(){
        addMark(23);
        addMark(45);
        addMark(67);
        addMark(67);
        addMark(95);
    }

    public int getTotal(){
        int total = 0;
        for (int mark : marks){ total += mark;}
        return total;
    }

    public int getAverage(){
        return getTotal() / marks.size();
    }

    void displayTotal(){
        System.out.println(getTotal());
    }

    void displayAverage(){
        System.out.println(getAverage());
    }
}
