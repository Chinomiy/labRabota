package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department {
    private String name;
    private Integer numberOfEmployees;
    private List<Employee> employees;
    private Company company;

    @Override
    public String toString() {
        return "Название отдела : - " + this.name + "\n"
                +
                "Сотрудники работающие в данном отделе:"
                +
                this.employees.toString() + "\n"
                +
                "Количество сотрудников: " + this.numberOfEmployees;
    }

    public Department(String name, Integer numberOfEmployees) {
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployees(Employee employee) {
        if (this.employees == null) {
            this.employees = new ArrayList<>();
        }
        employees.add(employee);
        employee.setDepartment(this);
        this.numberOfEmployees++;
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
        employee.setDepartment(null);
        this.numberOfEmployees--;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(numberOfEmployees, that.numberOfEmployees) && Objects.equals(employees, that.employees) && Objects.equals(company, that.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numberOfEmployees, employees, company);
    }
}
