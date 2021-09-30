package com.company;
import java.util.Random;
public class EmpWageComputationUsingOOPs {
    public static void main (String[] args) {
        System.out.println("Welcome To Employee Wage Compuation");
        int IS_FULL_TIME = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
