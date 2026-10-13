package za.co.mie;

public class Main {
    public static void main(){
//        StudentDetails student_info = new StudentDetails();
//        student_info.displayStudentDetails();
//
//        ShoppingTotal shop_total = new ShoppingTotal();
//        shop_total.displayTotalCost();

        TemperatureConverter converter = new TemperatureConverter(24, false);
        converter.displayConverted();
    }
}
