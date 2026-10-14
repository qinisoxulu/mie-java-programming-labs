package za.co.mie;

public class EvenOddArray {
    private int[] numbers;
    private int even_count;
    private int odd_count;

    public EvenOddArray(int[] p_numbers){
        numbers = p_numbers;
        countValues();
    }

    private void countValues(){
        even_count = 0;
        odd_count = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                even_count++;
            } else {
                odd_count++;
            }
        }
    }

    public int[] getEvenValues(){
        int[] evens = new int[even_count];
        int index = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                evens[index++] = number;
            }
        }
        return evens;
    }

    public int[] getOddValues(){
        int[] odds = new int[odd_count];
        int index = 0;
        for (int number : numbers){
            if (number % 2 != 0){
                odds[index++] = number;
            }
        }
        return odds;
    }

    void displayCounts(){
        System.out.println("Even values: " + even_count);
        System.out.println("Odd values: " + odd_count);
    }

    void displayEvenOrOdds(){
        StringBuilder evens = new StringBuilder();
        for (int even: getEvenValues()){
            if (!evens.isEmpty()){
                evens.append(", ");
            }
            evens.append(even);
        }
        System.out.println(evens);
    }
}
