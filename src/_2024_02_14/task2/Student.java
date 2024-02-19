package _2024_02_14.task2;

public class Student {
    //Часть 1:
    //Создайте класс Student, который имеет следующие поля:
    //
    //id (типа int) - уникальный идентификатор студента.
    //firstName (типа String) - имя студента.
    //lastName (типа String) - фамилия студента.
    //email (типа String) - электронная почта студента.
    //grade (типа double) - средний балл студента.
    //major (типа Enum) - специальность студента.
    //year (типа int) - курс обучения студента.
    //fullTime (типа boolean) - статус обучения студента (очно/заочно).
    //Должны быть реализованы конструктор для инициализации всех полей, геттеры и сеттеры для каждого поля.

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private double grade;
    private Major major;
    private int year;
    private boolean fullTime;

    public Student(int id, String firstName, String lastName, String email, double grade, Major major, int year, boolean fullTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.grade = grade;
        this.major = major;
        this.year = year;
        this.fullTime = fullTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isFulltime() {
        return fullTime;
    }

    public void setFulltime(boolean fulltime) {
        this.fullTime = fulltime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
