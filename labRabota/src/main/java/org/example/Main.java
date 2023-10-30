package org.example;

public class Main {
    public static void main(String[] args) {

        /*

                    A)
         */
        Company company = new Company("Some Company");
        Department depFirst = new Department("Department One", 10);
        Department depSecond = new Department("Department Two", 25);
        Employee first = new Employee("ALex", "Silvestrov", "Bruen", 10000, "SEO");
        Employee second = new Employee("Anna", "Vladimirovna", "Shoh", 5000, "Manager");
        Employee third = new Employee("David", "Maksimovich", "Vasil'ev", 6000, "Artist");

        /*
                    Б)
         */


        company.addDepartment(depFirst);
        company.addDepartment(depSecond);
        depFirst.addEmployees(first);
        depFirst.addEmployees(second);
        depSecond.addEmployees(third);
        System.out.println(depFirst);

        System.out.println("------------------------------------------");

        depFirst.removeEmployee(first);
        System.out.println(depFirst);

        /*
                B)
         */
        System.out.println("------------------------------------------");

        depFirst.addEmployees(first);
        System.out.println(company.findEmployee("BruenALexSilvestrov"));
        System.out.println(first.getFullName());
    }
}
