package za.co.mie;

import za.co.mie.lab_4.Product;

public class Main {
    public static void main(){
//        StudentDetails student_info = new StudentDetails();
//        student_info.displayStudentDetails();
//
//        ShoppingTotal shop_total = new ShoppingTotal();
//        shop_total.displayTotalCost();
//
//        TemperatureConverter converter = new TemperatureConverter(24, false);
//        converter.displayConverted();
//
//        PassOrFail user = new PassOrFail(56);
//        user.displayResults();
//
//        GradeCalculator student = new GradeCalculator(81);
//        student.displayResults();
//
//        NumberAnalysis analysis = new NumberAnalysis(24);
//        analysis.displayAnalysis();
//
//        LoginCheck log_user = new LoginCheck();
//        log_user.storeInfo("qiniso", "123");
//        System.out.println(log_user.checkInfo("qinis", "123"));
//
//        StudentMarks student_m = new StudentMarks();
//        student_m.displayTotal();
//        student_m.displayAverage();
//
//        ArrayStatistics numbers = new ArrayStatistics();
//        numbers.displayLargest();
//        numbers.displayLowest();
//        numbers.displayNumberOfElements();
//        numbers.displayNumsGreaterThan50();
//
//        ArraySearch search = new ArraySearch();
//        search.displayResults(23);
//        search.displayResults(0);

//        EvenOddArray nums = new EvenOddArray(new int[]{23, 45, 67, 67, 95, 22, 4, 8});
//        nums.displayCounts();
//        nums.displayEvenValues();
//        nums.displayOddValues();
//        ReverseArray names = new ReverseArray(new String[]{"Qiniso", "Phuti", "Lethabo"});
//        names.reverse();
//        names.display_reverse();
//        Student student_1 = new Student("Hisham", "002", 90);
//        Student student_2 = new Student("Phuti", "007", 85);
//        student_1.displayDetails();
//        student_1.hasPassed();
//        student_2.displayDetails();
//        student_2.hasPassed();
//
//        BankAccount account = new BankAccount("Qiniso Xulu", 1234, 0);
//        account.deposit(100);
//        account.deposit(100);
//        account.withdraw(201);
//        account.deposit(-1);
//        System.out.println(account.getBalance());

//        Rectangle rectangle = new Rectangle(30, 20);
//        rectangle.displayResults();

        Product milk = new Product("123", "Milk", 23.453554, 2);
        milk.add_stock(2);
        System.out.println(milk.stock_quantity);
        milk.reduce_stock(1);
    }
}
