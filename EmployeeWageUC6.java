package com.bridgelabz.EmployeeWageComputationAssessment;

public class EmployeeWageUC6 {
    public static void main(String[] args) {
        int workingDays = 20;
        int empWagePerHrs = 20;
        int totalEmpWage = 0;
        int empHrs = 0;
        int maxEmpHrs = 100;
        int totalEmpHrs = 0;
        int totalWorkingDays = 1;
        int empCheck = 0;
        while(totalEmpHrs <= maxEmpHrs && totalWorkingDays <= workingDays){
            empCheck = (int) (Math.floor((Math.random() * 10)) % 3);
            switch(empCheck){
                case 1:
                    System.out.println("Employee is present");
                    empHrs = 8;
                    break;
                case 2:
                    System.out.println("Employee is part time present");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalEmpHrs = totalEmpHrs + empHrs;
            System.out.println("Total days = " + totalWorkingDays + " Total Working Hours = " + totalEmpHrs);
            totalWorkingDays ++;
        }
        totalEmpWage = totalEmpHrs * empWagePerHrs;
        System.out.println("Total employee wage = " + totalEmpWage);
    }
}
