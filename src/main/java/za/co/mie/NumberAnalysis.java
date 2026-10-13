package za.co.mie;

public class NumberAnalysis {
    int number;
    public NumberAnalysis(int p_number){
        number = p_number;
    }
    public String skewness(){
        return number > 0 ? "positive" : (number < 0 ? "negative" : "zero");
    }
    public String symmetry(){
        return number % 2 == 0 ? "even" : "odd";
    }
    void displayAnalysis(){
        System.out.println("Your number is an " + symmetry() + " " + skewness() + " number");
    }
}
