package com.example.models;

public class Employee {
    private int idEmployee;
    private double salary;
    private Department department;
    private String name;

    public Employee() {
    }

    public Employee(int idEmployee, double salary, Department department, String name) {
        this.idEmployee = idEmployee;
        this.salary = salary;
        this.department = department;
        this.name = name;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + idEmployee +
                ", name='" + name + '\'' +
                ", department=" + department.getName() +
                ", salary=" + salary +
                '}';
    }
}
