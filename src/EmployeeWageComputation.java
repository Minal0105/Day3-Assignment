public class EmployeeWageComputation {
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static int calculateEmployeeWage(int empCheck) {
        int empHours = 0;

        switch (empCheck) {
            case PART_TIME:
                empHours = 4;
                break;
            case FULL_TIME:
                empHours = 8;
                break;
            default:
                empHours = 0;
                break;
        }

        return empHours * EMP_RATE_PER_HOUR;
    }

    public static void main(String[] args) {
        int empHours = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day = 0; day < NO_OF_WORKING_DAYS; day++) {
            int empCheck = (int) ((Math.random() * 10) % 3);
            empHours = calculateEmployeeWage(empCheck);
            empWage = empHours * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;

            System.out.println("Emp_wage : " + empWage);
        }

        System.out.println("Total Emp Wage: " + totalEmpWage);
    }
}
