package za.co.mie;

import za.co.mie.lab_1.ShoppingTotal;
import za.co.mie.lab_1.StudentDetails;
import za.co.mie.lab_1.TemperatureConverter;
import za.co.mie.lab_2.GradeCalculator;
import za.co.mie.lab_2.LoginCheck;
import za.co.mie.lab_2.NumberAnalysis;
import za.co.mie.lab_2.PassOrFail;
import za.co.mie.lab_3.*;
import za.co.mie.lab_4.BankAccount;
import za.co.mie.lab_4.Product;
import za.co.mie.lab_4.Rectangle;
import za.co.mie.lab_4.Student;

public class Main {
    public static void main(){
        StudentDetails student_info = new StudentDetails();
        student_info.displayStudentDetails();

        ShoppingTotal shop_total = new ShoppingTotal();
        shop_total.displayTotalCost();

        TemperatureConverter converter = new TemperatureConverter(24, false);
        converter.display_converted();

        PassOrFail user = new PassOrFail(56);
        user.display_results();

        GradeCalculator student = new GradeCalculator(81);
        student.display_results();

        NumberAnalysis analysis = new NumberAnalysis(24);
        analysis.display_analysis();

        LoginCheck log_user = new LoginCheck();
        log_user.store_info("qiniso", "123");
        System.out.println(log_user.check_info("qinis", "123"));

        StudentMarks student_m = new StudentMarks();
        student_m.display_total();
        student_m.display_average();

        ArrayStatistics numbers = new ArrayStatistics();
        numbers.display_largest();
        numbers.display_lowest();
        numbers.display_number_of_elements();
        numbers.display_nums_greater_than_50();

        ArraySearch search = new ArraySearch();
        search.display_results(23);
        search.display_results(0);

        EvenOddArray nums = new EvenOddArray(new int[]{23, 45, 67, 67, 95, 22, 4, 8});
        nums.display_counts();
        nums.display_even_values();
        nums.display_odd_values();

        ReverseArray names = new ReverseArray(new String[]{"Qiniso", "Phuti", "Lethabo"});
        names.reverse();
        names.display_reverse();

        Student student_1 = new Student("Hisham", "002", 90);
        Student student_2 = new Student("Phuti", "007", 85);
        student_1.display_details();
        student_1.has_passed();
        student_2.display_details();
        student_2.has_passed();

        BankAccount account = new BankAccount("Qiniso Xulu", 1234, 0);
        account.deposit(100);
        account.deposit(100);
        account.withdraw(201);
        account.deposit(-1);
        System.out.println(account.getBalance());

        Rectangle rectangle = new Rectangle(30, 20);
        rectangle.display_results();

        Product milk = new Product("123", "Milk", 23.453554, 2);
        milk.add_stock(2);
        System.out.println(milk.stock_quantity);
        milk.reduce_stock(1);


    }
}
