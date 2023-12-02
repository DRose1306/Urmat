package _2023_11_22.one;

public class HRManager extends Employee {
    private int numberOfRecruitments;
    private String[] candidateList;
    @Override
    public void work() {
        System.out.println("HR листает анкеты");
    }

    @Override
    public void takeBreak() {
        System.out.println("HR листает инстаграм");
    }

//3.5. Класс _2023_11_22.one.HRManager:
//Наследует _2023_11_22.one.Employee.
//Дополнительные поля: numberOfRecruitments, массив candidateList.
//Реализация методов work() и takeBreak() для HR-специалиста.
}
