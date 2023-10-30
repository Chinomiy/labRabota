package org.example;

public class Employee {
    private String name;
    private String LastName;
    private String firstName;
    private Integer salary;
    private String positionAtWork;
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return name + " " +
                LastName + " " +
                firstName + " " +
                "Зарплата =" + salary +
                "Должность='" + positionAtWork;
    }

    public Employee(String name, String lastName, String firstName, Integer salary, String positionAtWork) {
        this.name = name;
        LastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
        this.positionAtWork = positionAtWork;
    }
    
    public String getFullName() {
        return this.firstName + this.name + this.LastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPositionAtWork() {
        return positionAtWork;
    }

    public void setPositionAtWork(String positionAtWork) {
        this.positionAtWork = positionAtWork;
    }
}