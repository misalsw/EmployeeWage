package com.bridgelabz;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        MainClass obj = new MainClass();
        Scanner input = new Scanner(System.in);

        System.out.println(" Please Enter the Max no of Working Days in a Month: ");
        int no_of_days = input.nextInt();

        System.out.println("Please Enter the max no of working hours in a month: ");
        int max_hrs_in_month = input.nextInt();

        System.out.println("Please Enter the Wages per hour: ");
        int wages_per_hour = input.nextInt();

        obj.calculate( no_of_days, max_hrs_in_month, wages_per_hour);

    }
}
