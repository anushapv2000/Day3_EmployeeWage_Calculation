package com.bridgelabz;

public class EmployeeWage {
public static void main(String[] args)
{   int Wageperhour=20;
    int Fulldayhour=8;
    int dailywage=0;
    int Parttimehour=4;
    System.out.println("Welcome to Employee Wage Computation");
    int emp_check=(int)(Math.random()*10)%3;
   // System.out.println(emp_check);
    switch (emp_check){
        case 1:
            System.out.println("employee is fulltime");
            dailywage=Wageperhour*Fulldayhour;
            break;
        case 2:
            dailywage=Parttimehour*Wageperhour;
            System.out.println("Employee is parttime");
            break;
        default:
            System.out.println("employee absent");
    }

    System.out.println("employee wage="+dailywage);
}
}
