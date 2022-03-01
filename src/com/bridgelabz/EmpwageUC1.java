package com.bridgelabz;

public class EmpwageUC1 {

    public static void main(String[] args) {
        int P = 1;
        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == P)
            System.out.println("Employee is Love");
        else
            System.out.println("Employee is Absent");
    }
}
