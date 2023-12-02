package _2023_11_22.one;

abstract class Employee implements EmployeeActions{
    protected String name;
    protected int age;
    protected String department;
    protected double salary;

    @Override
    public void work() {
        System.out.println("Работник за работой");
    }

    @Override
    public void takeBreak() {
        System.out.println("Работник отдыхает");
    }

    //3.2. Абстрактный класс _2023_11_22.one.Employee:
    //Общие поля: name, age, department, salary.
    //Реализовать интерфейс _2023_11_22.one.EmployeeActions.
    //Абстрактные методы work() и takeBreak().


}
