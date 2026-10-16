package za.co.mie.lab_3;

public class ArrayStatistics {
    private int[] numbers = {23, 45, 67, 67, 95, 22};

    public int getLargest(){
        int largest = numbers[0];
        for (int number : numbers){
            if (number > largest) { largest = number; }
        }
        return largest;
    }

    public void display_largest(){
        System.out.println(getLargest());
    }

    public int getLowest(){
        int lowest = numbers[0];
        for (int number : numbers){
            if (number < lowest) { lowest = number; }
        }
        return lowest;
    }

    public void display_lowest(){
        System.out.println(getLowest());
    }

    public int getNumberOfElements(){
        return numbers.length;
    }

    public void display_number_of_elements(){
        System.out.println(getNumberOfElements());
    }

    public int getNumsGreaterThan50(){
        int count = 0;
        for (int number : numbers){
            if (number > 50) { count++; }
        }
        return count;
    }

    public void display_nums_greater_than_50(){
        System.out.println(getNumsGreaterThan50());
    }
}