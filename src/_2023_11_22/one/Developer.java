package _2023_11_22.one;

public class Developer extends Employee{
    private String programmingLanguage;
    private boolean remote;
    @Override
    public void work() {
        System.out.println("разработчик в раздумьях");
    }

    @Override
    public void takeBreak() {
        System.out.println("пьет кофе и обдумывает");
    }

    //3.4. Класс _2023_11_22.one.Developer:
    //Наследует _2023_11_22.one.Employee.
    //Дополнительные поля: programmingLanguage, remote (булево значение).
    //Реализация методов work() и takeBreak() с учетом специфики работы разработчика.
}
