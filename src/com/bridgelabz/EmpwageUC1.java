package com.bridgelabz;

public class EmployeeWages {

    public static void main(String[] args) {
        System.out.println("Attendance");
        int IS_PRESENT = 1;
        int empcheck = (int)Math.floor(Math.random() * 10) % 2;
        if (empcheck == IS_PRESENT)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }

}
