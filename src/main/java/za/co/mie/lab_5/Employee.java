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

    public String get_salary(){
        if (this.monthly_salary < 10000){
            return "Below 10,000";
        } else if (this.monthly_salary < 20000){
            return "10,000 up to but not including 20,000";
        } else {
            return "20,000 and above";
        }
    }

    public void display_details(){
        System.out.println(this.employee_number + " " + this.name + " R" + this.monthly_salary + " " + get_salary());
    }

    public static Employee[] get_above_threshold(Employee[] employees, double threshold){
        int count = 0;
        for (Employee employee : employees){
            if (employee.monthly_salary > threshold){ count++; }
        }
        Employee[] above = new Employee[count];
        int index = 0;
        for (Employee employee : employees){
            if (employee.monthly_salary > threshold){ above[index++] = employee; }
        }
        return above;
    }

    public static void display_above_threshold(Employee[] employees, double threshold){
        Employee[] above = get_above_threshold(employees, threshold);
        System.out.println("Earning more than R" + threshold + ": " + above.length);
        for (Employee employee : above){
            employee.display_details();
        }
    }

    public static Employee get_highest_paid(Employee[] employees){
        if (employees.length == 0){ return null; }
        Employee highest = employees[0];
        for (Employee employee : employees){
            if (employee.monthly_salary > highest.monthly_salary){ highest = employee; }
        }
        return highest;
    }

    public static void display_highest_salary(Employee[] employees){
        Employee highest = get_highest_paid(employees);
        if (highest == null){
            System.out.println("No employees");
        } else {
            System.out.println("Highest salary: R" + highest.monthly_salary + " (" + highest.name + ")");
        }
    }

    public static double get_average_salary(Employee[] employees){
        double total = 0;
        for (Employee employee : employees){ total += employee.monthly_salary; }
        return employees.length > 0 ? total / employees.length : 0;
    }

    public static void display_average_salary(Employee[] employees){
        System.out.println("Average salary: R" + get_average_salary(employees));
    }
}