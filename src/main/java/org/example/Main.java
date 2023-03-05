package org.example;

public class Main {
    public static void main(String[] args) {

        int hoursWorked = 48;
        int costPerHour = 5000;

        double retentionPer = 0.125;

        double rawSalary = hoursWorked * costPerHour;
        double retention = retentionPer * rawSalary;
        double netSalary = rawSalary - retention;

        System.out.println("El salario bruto es de " + rawSalary + ".\n" +
                "La retención es de "+ retention + " (" + retentionPer*100 + "%). \n" +
                "Y el salario neto es de " + netSalary );
    }
}