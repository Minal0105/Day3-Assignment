public class EmployeeWageComputation {
    public static void main(String[] args) {
        int Full_time=1;
        int Part_time=2;
        int wage_per_hour=20;
        int emp_hours;
        int emp_wage;
        int empcheck=(int)((Math.random()*10)%3);
        if(empcheck==Part_time){
            emp_hours=8;
        }
        else if(empcheck==Full_time) {
            emp_hours=10;
        }
        else emp_hours=0;
        emp_wage=emp_hours*wage_per_hour;
        System.out.println("Emp_wage : "+emp_wage);
    }
}
