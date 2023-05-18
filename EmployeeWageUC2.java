package com.bridgelabz.EmployeeWageComputationAssessment;

public class EmployeeWageUC2 {
    public static void main(String[] args) {

        int IS_FULL_TIME = 1;
        int WAGE_PER_HR = 20;
        int FULL_DAY = 8;
        int dailyWage = 0;
        int empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
        if (empCheck == IS_FULL_TIME) {
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HR * FULL_DAY;
            System.out.println("Employee pay per day = " + dailyWage);
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
