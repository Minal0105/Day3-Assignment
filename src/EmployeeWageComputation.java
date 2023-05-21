public class EmployeeWageComputation {
    public static final int Full_time = 1;
    public static final int Part_time = 2;
    public static final int Emp_rate_per_hour = 20;
    public static final int No_of_working_days = 20;

    public static void main(String[] args)
    {

        int emp_hours = 0;
        int emp_wage = 0;
        int Totle_emp_wage = 0;
        for (int day = 0; day < No_of_working_days; day++) {
            int empcheck = (int) ((Math.random() * 10) % 3);
            switch (empcheck) {
                case Part_time:
                    emp_hours = 4;
                    break;
                case Full_time:
                    emp_hours = 8;
                default:
                    emp_hours = 0;
            }
            emp_wage = emp_hours * Emp_rate_per_hour;
            Totle_emp_wage += emp_wage;
            System.out.println("Emp_wage : " + emp_wage);
        }
        System.out.println("Totle Emp Wage" + Totle_emp_wage);
    }
}
