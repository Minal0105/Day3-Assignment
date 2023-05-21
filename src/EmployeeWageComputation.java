public class EmployeeWageComputation {
    public static final int Full_time=1;
    public static final int Part_time=2;
    public static final int Emp_rate_per_hour=20;
    public static void main(String[] args)
    {
        int emp_hours=0;
        int emp_wage=0;
        int empcheck=(int)((Math.random()*10)%4);
        switch(empcheck)
        {
            case Full_time :
                emp_hours=9;
                break;
            case Part_time :
                emp_hours=8;
                break;
            default :
                emp_hours=0;
        }
        emp_wage=emp_hours*Emp_rate_per_hour;
        System.out.println("Emp_wage : "+emp_wage);
    }
}
