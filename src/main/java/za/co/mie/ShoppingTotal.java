package za.co.mie;

// Exercise 1.2
public class ShoppingTotal {
    String product_name = "Milk";
    float price = 24.99f;
    int quantity = 4;

    public float calculateTotalCost(float discount_percent){
        float total_price = price * quantity;
        float discount_price = total_price * (discount_percent / 100);
        return (total_price - discount_price);
    }

    public float calculateTotalCost(){
        return (calculateTotalCost(0.0f));
    }

    public void displayTotalCost(){
        System.out.println("The total of all the " + product_name + " is " + calculateTotalCost());
    }
}
