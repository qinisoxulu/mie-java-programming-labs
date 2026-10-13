package za.co.mie;
import java.util.ArrayList;

public class ArrayStatistics {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public ArrayStatistics(){
        addNumbers();
    }

    private void addNumbers(int number){
        numbers.add(number);
    }

    private void addNumbers(){
        addNumbers(23);
        addNumbers(45);
        addNumbers(67);
        addNumbers(67);
        addNumbers(95);
        addNumbers(22);
    }

    public int getLargest(){
        int largest = numbers.getFirst();
        for (int number : numbers){
            if (number > largest) { largest = number; };
        }
        return largest;
    }

    void displayLargest(){
        System.out.println(getLargest());
    }

    public int getLowest(){
        int lowest = numbers.getFirst();
        for (int number : numbers){
            if (number < lowest) { lowest = number; };
        }
        return lowest;
    }

    void displayLowest(){
        System.out.println(getLowest());
    }

    public int getNumberOfElements(){
        return numbers.size();
    }

    void displayNumberOfElements(){
        System.out.println(getNumberOfElements());
    }

    public int getNumsGreaterThan50 (){
        int count = 0;
        for (int number : numbers){
            if (number >= 50) { count += 1; }
        }
        return count;
    }
    void displayNumsGreaterThan50(){
        System.out.println(getNumsGreaterThan50());
    }
}