package com.bridgelabz;

public class EmployeeWage {
    static int Wageperhour=20;
    static int Fulldayhour=8;

    static int Parttimehour=4;
    static int workingdaysmonth=20;

    static int totalworkinghours=100;

public static void main(String[] args)
{
    System.out.println("Welcome to Employee Wage Computation");
    code_refactor();
}

   // System.out.println(emp_check);
    public static void code_refactor(){
        int d_count=1;
        int t_wages=0;
        int t_hours=0;
        int dailywage=0;
    while (d_count<=workingdaysmonth && t_hours<=totalworkinghours) {
        int emp_check = (int) (Math.random() * 10) % 3;
        switch (emp_check) {
            case 1:
                System.out.println("employee is fulltime");
                dailywage = Wageperhour * Fulldayhour;
                t_hours+=Fulldayhour;
                System.out.println("fulltime wage="+dailywage);
                break;
            case 2:
                dailywage = Parttimehour * Wageperhour;
                System.out.println("Employee is parttime");
                t_hours+=Parttimehour;
                System.out.println("parttime wage="+dailywage);
                break;
            default:
                System.out.println("employee absent");
                break;
        }
        t_wages = t_wages + dailywage;
        d_count=d_count+1;
    }
    System.out.println("employee wage for 1 month="+t_wages);
    System.out.println("Total working hours="+t_hours);
}
}
