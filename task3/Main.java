package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        Employee emp = new Employee(salary);
        emp.printAdjustment();

        scanner.close();
    }
}

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double[] calculateBonus() {
        double percentage;
        if (salary <= 400.00) {
            percentage = 15;
        } else if (salary <= 800.00) {
            percentage = 12;
        } else if (salary <= 1200.00) {
            percentage = 10;
        } else if (salary <= 2000.00) {
            percentage = 7;
        } else {
            percentage = 4;
        }

        double bonus = salary * percentage / 100.0;
        double newSalary = salary + bonus;
        return new double[] { newSalary, bonus, percentage };
    }

    public void printAdjustment() {
        double[] result = calculateBonus();
        System.out.printf("Novo salario: %.2f\n", result[0]);
        System.out.printf("Reajuste ganho: %.2f\n", result[1]);
        System.out.printf("Em percentual: %.0f %%\n", result[2]);
    }
}


