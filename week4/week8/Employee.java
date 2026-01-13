package week4.week8;


/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee
{
    // Employee.java
    // Private attribute
    private double basicSalary;

    // Constructor to initialize salary
    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Method to calculate gross salary (adds 20% bonus)
    public double calculateGrossSalary() {
        double bonus = basicSalary * 0.20;
        return basicSalary + bonus;
    }

    // Getter for basic salary
    public double getBasicSalary() {
        return basicSalary;
    }
}

