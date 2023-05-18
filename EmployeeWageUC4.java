package com.bridgelabz.EmployeeWageComputationAssessment;

public class EmployeeWageUC4 {
    public static void main(String[] args) {
        final int WAGE_PER_HR = 20;
        final int FULL_DAY = 8;
        final int PART_TIME = 4;
        int dailyWage;
        int empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
        System.out.println(empCheck);
        switch (empCheck) {
            case 1: {
                System.out.println("Employee is present");
                dailyWage = WAGE_PER_HR * FULL_DAY;
                System.out.println("Daily wage of employee = " + dailyWage);
            }
            break;
            case 2: {
                System.out.println("Employee is part time");
                dailyWage = WAGE_PER_HR * PART_TIME;
                System.out.println("Daily part time employee = " + dailyWage);
            }
            break;
            default:
                System.out.println("Employee is absent");

        }
    }
}
