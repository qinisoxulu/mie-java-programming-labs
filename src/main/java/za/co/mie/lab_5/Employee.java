package za.co.mie.lab_5;

public class Employee {
    private String employee_number;
    private String name;
    private double monthly_salary;

    public Employee(String p_employeeNumber, String p_name, double p_monthlySalary){
        this.employee_number = p_employeeNumber;
        this.name = p_name;
        this.monthly_salary = p_monthlySalary;
    }

    public String get_name(){
        return this.name;
    }

    public double get_monthly_salary(){
        return this.monthly_salary;
    }

    public String get_salary_band(){
        if (this.monthly_salary < 10000){
            return "Below 10,000";
        } else if (this.monthly_salary < 20000){
            return "10,000 up to but not including 20,000";
        } else {
            return "20,000 and above";
        }
    }

    public void display_details(){
        System.out.println(this.employee_number + " " + this.name + " R" + this.monthly_salary + " " + get_salary_band());
    }
}
