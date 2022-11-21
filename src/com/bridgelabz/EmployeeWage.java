package com.bridgelabz;

public class EmployeeWage {
public static void main(String[] args)
{   int Wageperhour=20;
    int Fulldayhour=8;
    int dailywage=0;
    System.out.println("Welcome to Employee Wage Computation");
    int emp_check=(int)(Math.random()*10)%2;
   // System.out.println(emp_check);
    if(emp_check==1){
        System.out.println("employee present");
        dailywage=Wageperhour*Fulldayhour;
        System.out.println("Daily wage = "+dailywage);
    }
    else {
        System.out.println("employee absent");
    }
}
}
