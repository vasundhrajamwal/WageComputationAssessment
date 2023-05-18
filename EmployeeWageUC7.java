package com.bridgelabz.EmployeeWageComputationAssessment;

public class EmployeeWageUC7 {
    final int workingDays = 20;
    final int empWagePerHrs = 20;
    int empHrs;
    int maxEmpHrs = 100;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;
    static int totalEmployeeWage = 0;
    int empCheck;
    public void employeeWage(){
        while (totalEmpHrs <= maxEmpHrs && totalWorkingDays < workingDays) {
            totalWorkingDays ++;
            empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck){
                case 1 :
                    System.out.println("Employee is present");
                    empHrs = 8;
                    break;
                case 2:
                    System.out.println("Employee Part time is present");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    empHrs = 0;
            }
            totalEmpHrs =empHrs + totalEmpHrs;
            System.out.println("Total days = " + totalWorkingDays + " Total Working Hours = " + totalEmpHrs);
        }
        totalEmployeeWage = totalEmpHrs + empWagePerHrs;
    }

    public static void main(String[] args) {
        EmployeeWageUC7 obj = new EmployeeWageUC7();
        obj.employeeWage();
        System.out.println("Total Employee Wage : " + totalEmployeeWage);
    }
}
