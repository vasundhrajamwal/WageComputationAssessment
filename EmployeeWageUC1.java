package com.bridgelabz.EmployeeWageComputationAssessment;

public class EmployeeWageUC1 {
    public static void main(String[] args) {
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == 1) {
            System.out.println("Employee is present");
        }
        else
            System.out.println("Employee is absent");
    }
}
