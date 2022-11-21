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
    if(emp_check==1){
        System.out.println("employee is fulltime");
        dailywage=Wageperhour*Fulldayhour;
        //System.out.println("fulltime wage = "+dailywage);
    } else if (emp_check==2) {
        dailywage=Parttimehour*Wageperhour;
        System.out.println("Employee is parttime");
        //System.out.println("Partime Wage="+dailywage);
    } else {
        System.out.println("employee absent");
    }
    System.out.println("employee wage="+dailywage);
}
}
