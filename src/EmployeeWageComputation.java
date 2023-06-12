public class EmployeeWageComputation {
    public static final int Part_time = 1;
    public static final int Full_time = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;

    public EmployeeWageComputation(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public static void calculateEmployeeWageForCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        int emp_hours = 0;
        int total_emp_hours = 0;
        int total_working_days = 0;

        while (total_emp_hours <= maxHoursPerMonth && total_working_days < numOfWorkingDays) {
            total_working_days++;
            int empcheck = (int) ((Math.random() * 10) % 3);
            switch (empcheck) {
                case Part_time:
                    emp_hours = 4;
                    break;
                case Full_time:
                    emp_hours = 8;
                    break;
                default:
                    emp_hours = 0;
            }
            total_emp_hours += emp_hours;
            System.out.println("Days: " + total_working_days + ": Employee Hours: " + emp_hours);
        }

        int total_emp_wage = total_emp_hours * empRatePerHour;
        System.out.println("Total Employee Wage for company " + company + ": " + total_emp_wage);
    }
    public static void main(String[] args) {
        calculateEmployeeWageForCompany("Tata Power", 20, 2, 10);
        calculateEmployeeWageForCompany("Adani Power", 15, 3, 12);
        calculateEmployeeWageForCompany("Panacea", 25, 4, 15);
    }
}
