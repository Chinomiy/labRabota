package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
        department.setCompany(this);
    }

    public List<Department> getDepartment() {
        return this.departments;
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
        department.setCompany(null);
    }

    /*
    Формат поиска:
    Фамилия Имя Отчество
    Optional.empty == Сотрудник не найден
     */
    public Optional<Employee> findEmployee(String fullName) {

        return departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getFullName().equals(fullName))
                .findFirst();

    }
}
