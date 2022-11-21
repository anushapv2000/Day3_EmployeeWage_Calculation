package com.bridgelabz;

public class EmployeeWage {
public static void main(String[] args)
{   int Wageperhour=20;
    int Fulldayhour=8;
    int dailywage=0;
    int Parttimehour=4;
    int workingdaysmonth=20;
    int d_count=1;
    int t_wages=0;
    System.out.println("Welcome to Employee Wage Computation");

   // System.out.println(emp_check);
    while (d_count<=workingdaysmonth) {
        int emp_check = (int) (Math.random() * 10) % 3;
        switch (emp_check) {
            case 1:
                System.out.println("employee is fulltime");
                dailywage = Wageperhour * Fulldayhour;
                System.out.println("fulltime wage="+dailywage);
                break;
            case 2:
                dailywage = Parttimehour * Wageperhour;
                System.out.println("Employee is parttime");
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
}
}
