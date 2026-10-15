package za.co.mie.lab_4;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double p_width, double p_height){
        this.width = p_width;
        this.height = p_height;
    }

    public double area(){
        return this.width * this.height;
    }

    public double perimeter(){
        return 2 * (this.width + this.height);
    }

    public void displayResults(){
        System.out.println("Width: " + this.width + ", Height: " + this.height);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}
