package za.co.mie.lab_5;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String p_name, double p_price, int p_quantity){
        if (p_price < 0){
            throw new IllegalArgumentException("Price cannot be negative: " + p_price);
        }
        if (p_quantity < 0){
            throw new IllegalArgumentException("Quantity cannot be negative: " + p_quantity);
        }
        this.name = p_name;
        this.price = p_price;
        this.quantity = p_quantity;
    }

    public String get_name(){
        return name;
    }

    public double get_price(){
        return price;
    }

    public int get_quantity(){
        return quantity;
    }

    public double calculate_line_total(){
        return price * quantity;
    }
}
