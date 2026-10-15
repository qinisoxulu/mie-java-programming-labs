package za.co.mie;

public class Product {
    private String product_id;
    private String name;
    private double price;
    protected int stock_quantity;

    public Product(String p_product_id, String p_name, double p_price, int p_stock_quantity){
        this.product_id = p_product_id;
        this.name = p_name;
        this.price = p_price;
        this.stock_quantity = p_stock_quantity >= 0 ? p_stock_quantity : 0;
    }

    public int add_stock(int quantity){
        return quantity > 0 ? this.stock_quantity += quantity : this.stock_quantity;
    }

    public int reduce_stock(int quantity){
        return quantity > 0 || quantity <= this.stock_quantity ? this.stock_quantity -= quantity : this.stock_quantity;
    }

    public double calculate_stock_value(){
        return this.price * this.stock_quantity;
    }

    public void display_details(){
        System.out.println("Product ID: " + this.product_id);
        System.out.println("Name: " + this.name);
        System.out.printf("Price: R%.2f", this.price);
        System.out.println();
        System.out.println("Stock: " + this.stock_quantity);
        System.out.println();
        System.out.printf("Stock value: R%.2f", this.calculate_stock_value());
    }
}
