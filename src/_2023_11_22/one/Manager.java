package _2023_11_22.one;

public class Manager extends Employee{

    private int teamsize;
    private String[] teamMembers;

    @Override
    public void work() {
        System.out.println("Менеджер следит за рабочим процессом");
    }

    @Override
    public void takeBreak() {
        System.out.println("Менеджер пьет кофе");
    }

    //3.3. Класс _2023_11_22.one.Manager:
    //Наследует _2023_11_22.one.Employee.
    //Дополнительные поля: teamSize, массив teamMembers.
    //Реализация методов work() и takeBreak() с учетом роли менеджера.


}
