package DefiningClassesExercises.CompanyRoster02;

import java.util.ArrayList;

import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public double getAverageSalary() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }

    @Override
    public String toString() {
        return String.format("Highest Average Salary: %s%n", this.getName());
    }
}
