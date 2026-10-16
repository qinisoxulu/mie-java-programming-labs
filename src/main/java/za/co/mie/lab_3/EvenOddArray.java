package za.co.mie.lab_3;

public class EvenOddArray {
    private int[] numbers;
    private int even_count;
    private int odd_count;

    public EvenOddArray(int[] p_numbers){
        this.numbers = p_numbers;
        countValues();
    }

    private void countValues(){
        for (int number : numbers){
            if (number % 2 == 0){
                this.even_count++;
            } else {
                this.odd_count++;
            }
        }
    }

    public void display_counts(){
        System.out.println("Even values: " + this.even_count);
        System.out.println("Odd values: " + this.odd_count);
    }

    public int[] getEvenValues(){
        int[] evens = new int[this.even_count];
        int index = 0;
        for (int number : numbers){
            if (number % 2 == 0){
                evens[index++] = number;
            }
        }
        return evens;
    }

    public void display_even_values(){
        StringBuilder evens = new StringBuilder();
        for (int even: getEvenValues()){
            if (!evens.isEmpty()){
                evens.append(", ");
            }
            evens.append(even);
        }
        System.out.println(evens);
    }

    public int[] getOddValues(){
        int[] odds = new int[this.odd_count];
        int index = 0;
        for (int number : numbers){
            if (number % 2 != 0){
                odds[index++] = number;
            }
        }
        return odds;
    }

    public void display_odd_values(){
        StringBuilder odds = new StringBuilder();
        for (int odd: getOddValues()){
            if (!odds.isEmpty()){
                odds.append(", ");
            }
            odds.append(odd);
        }
        System.out.println(odds);
    }
}
