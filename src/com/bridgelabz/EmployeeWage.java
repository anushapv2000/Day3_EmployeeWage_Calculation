package com.bridgelabz;

public class EmployeeWage {
public static void main(String[] args)
{
    System.out.println("Welcome to Employee Wage Computation");
    int emp_check=(int)(Math.random()*10)%2;
   // System.out.println(emp_check);
    if(emp_check==1){
        System.out.println("employee present");
    }
    else {
        System.out.println("employee absent");
    }
}
}
