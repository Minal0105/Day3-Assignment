public class EmployeeWageComputation {
    public static final int Part_time = 1;
    public static final int Full_time = 2;
    public static final int Emp_rate_per_hour = 20;
    public static final int No_of_working_days = 20;
    public static final int Max_hours_in_month = 100;

    public static void main(String[] args) {

        int emp_hours = 0;
        int Totle_emp_hours = 0;
        int Totle_working_days = 0;
        int Totle_emp_wage = 0;
        while (Totle_emp_hours<=Max_hours_in_month && Totle_working_days < No_of_working_days) {
            Totle_working_days++;
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
            Totle_emp_hours += emp_hours;
            System.out.println("Days :"+Totle_working_days + " EmpHours :" +emp_hours);
        }
        Totle_emp_wage=Totle_emp_hours * Emp_rate_per_hour;
        System.out.println("Totle Emp Wage" + Totle_emp_wage);
    }
}
