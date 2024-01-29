package DefiningClassesExercises.CompanyRoster02;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departments = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String name = tokens[0];
            double salary = Double.parseDouble(tokens[1]);
            String position = tokens[2];
            String departmentName = tokens[3];
            String email = "n/a";
            int age = -1;

            if (tokens.length >= 6) {
                email = tokens[4];
                age = Integer.parseInt(tokens[5]);
            }
            if (tokens.length == 5 ) {
                if(tokens[4].contains("@")){
                    email = tokens[4];
                } else {
                    age = Integer.parseInt(tokens[4]);
                }
            }
            Employee employee = new Employee(name, salary, position, departmentName, email, age);

            departments.putIfAbsent(departmentName, new Department(departmentName));
            departments.get(departmentName).addEmployee(employee);
        }

        Department highestAverageSalaryDepartment = null;
        double highestAverageSalary = Double.MIN_VALUE;

        for (Department department : departments.values()) {
            double averageSalary = department.getAverageSalary();
            if (averageSalary > highestAverageSalary) {
                highestAverageSalary = averageSalary;
                highestAverageSalaryDepartment = department;
            }
        }

        System.out.printf("Highest Average Salary: %s%n", highestAverageSalaryDepartment.getName());

        highestAverageSalaryDepartment.getEmployees().stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .forEach(employee -> {
                    System.out.printf("%s %.2f %s %d%n",
                            employee.getName(),
                            employee.getSalary(),
                            employee.getEmail(),
                            employee.getAge());
                });
    }
}
