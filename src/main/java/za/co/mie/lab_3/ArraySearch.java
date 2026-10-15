package za.co.mie.lab_3;

public class ArraySearch {
    private int[] numbers = {23, 45, 67, 67, 95, 22};

    public String search(int value){
        StringBuilder indices = new StringBuilder();
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == value){
                if (!indices.isEmpty()) indices.append(", ");
                indices.append(i);
            }
        }
        return indices.isEmpty() ? "Value not found" : indices.toString();
    }

    void displayResults(int value){
        System.out.println(search(value));
    }
}