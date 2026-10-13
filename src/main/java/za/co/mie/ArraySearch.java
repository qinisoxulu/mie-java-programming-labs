package za.co.mie;

import java.util.ArrayList;

public class ArraySearch {
    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    public ArraySearch() {
        addNumbers();
    }

    private void addNumbers(int number) {
        numbers.add(number);
    }

    private void addNumbers() {
        addNumbers(23);
        addNumbers(45);
        addNumbers(67);
        addNumbers(67);
        addNumbers(95);
        addNumbers(22);
    }

    public String search(int value){
        return numbers.contains(value) ? Integer.toString(numbers.indexOf(value)) : "Value not found";
    }

    void displayResults(int value){
        System.out.println(search(value));
    }
}