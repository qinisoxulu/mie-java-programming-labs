package za.co.mie;

public class Main {
    public static void main(){
        StudentDetails student_info = new StudentDetails();
        student_info.displayStudentDetails();

        ShoppingTotal shop_total = new ShoppingTotal();
        shop_total.displayTotalCost();

        TemperatureConverter converter = new TemperatureConverter(24, false);
        converter.displayConverted();

        PassOrFail user = new PassOrFail(56);
        user.displayResults();

        GradeCalculator student = new GradeCalculator(81);
        student.displayResults();

        NumberAnalysis analysis = new NumberAnalysis(24);
        analysis.displayAnalysis();

        LoginCheck log_user = new LoginCheck();
        log_user.storeInfo("qiniso", "123");
        System.out.println(log_user.checkInfo("qinis", "123"));

        StudentMarks student_m = new StudentMarks();
        student_m.displayTotal();
        student_m.displayAverage();
    }
}
