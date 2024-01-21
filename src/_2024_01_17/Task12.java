package _2024_01_17;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Task12 {
    public static void main(String[] args) {
        //Напишите метод, который объединяет данные из вложенных коллекций разных объектов и считает сумму некоторого числового атрибута.
        List<Department> departments = Arrays.asList(
                new Department("BackEnd", Arrays.asList(new Employeee("Urmat", 5000.0),
                        new Employeee("Saveliy", 4999.9),
                        new Employeee("Dmitry", 4999.8))),
                new Department("FrontEnd", Arrays.asList(new Employeee("Irina", 4000.0),
                        new Employeee("Raisa", 3999.9),
                        new Employeee("Ekaterina", 3999.8))),
                new Department("QA", Arrays.asList(new Employeee("Katya", 3000.0),
                        new Employeee("Alex", 2999.9),
                        new Employeee("Max", 2999.8))));

        System.out.println(getTotalSalaryByDepartment(departments, "BackEnd"));

    }

    static double getTotalSalaryByDepartment(List<Department> departments, String departmentName) {
        return departments.stream()
                .filter(el -> el.getName().equals(departmentName))
                .flatMap(el -> el.getEmployees().stream())
                .mapToDouble(Employeee::getSalary)
                .sum();
    }
}

class Department {
    private String name;
    private List<Employeee> employees;

    public Department(String name, List<Employeee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public List<Employeee> getEmployees() {
        return employees;
    }
}

class Employeee {
    private String name;
    private double salary;

    public Employeee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
