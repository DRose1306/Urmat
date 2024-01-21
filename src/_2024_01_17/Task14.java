package _2024_01_17;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

import static _2024_01_17.Employeee.*;

public class Task14 {
    public static void main(String[] args) {
        //Напишите метод, который обрабатывает список объектов, содержащих другие объекты с коллекциями.
        //Ваша задача - вычислить среднее значение некоторого числового поля для каждого уникального ключа.

        Employeee employee1 = new Employeee("Employee1", 50000.0);
        Employeee employee2 = new Employeee("Employee2", 60000.0);
        Department2 department1 = new Department2("Department1", List.of(employee1, employee2));

        Employeee employee3 = new Employeee("Employee3", 70000.0);
        Employeee employee4 = new Employeee("Employee4", 80000.0);
        Department2 department2 = new Department2("Department2", List.of(employee3, employee4));

        Company company1 = new Company("Company1", List.of(department1, department2));

        Employeee employee5 = new Employeee("Employee5", 90000.0);
        Employeee employee6 = new Employeee("Employee6", 100000.0);
        Department2 department3 = new Department2("Department3", List.of(employee5, employee6));

        Company company2 = new Company("Company2", List.of(department3));

        List<Company> companies = List.of(company1, company2);

        System.out.println(averageSalaryByCompany(companies));

    }

    static Map<String, Double> averageSalaryByCompany(List<Company> companies) {

       /* double averageSalary = companies.stream()
                .flatMap(company -> company.getDepartments().stream())
                .flatMap(department2 -> department2.getEmployees().stream())
                .mapToDouble(Employeee::getSalary)
                .average()
                .orElse(0.0);

        return companies.stream()
                .collect(Collectors.toMap(Company::getName, company -> averageSalary));*/

        return companies.stream()
                .collect(Collectors.toMap(
                        Company::getName,
                        company -> company.getDepartments().stream()
                                .flatMap(department -> department.getEmployees().stream())
                                .mapToDouble(Employeee::getSalary)
                                .average()
                                .orElse(0.0)
                ));
    }
}

class Company {
    private String name;
    private List<Department2> departments;

    public Company(String name, List<Department2> departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public List<Department2> getDepartments() {
        return departments;
    }
}

class Department2 {
    private String name;
    private List<Employeee> employees;

    public Department2(String name, List<Employeee> employees) {
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

