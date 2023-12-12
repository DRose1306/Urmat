package _2023_11_20.two.library;

public class Book {
    //Книга (Book)
    //        Поля: название, автор, год издания.
    //                Методы: вывод информации о книге, проверка на старинность (старше 50 лет).
    private String name;
    private String author;
    private int yehrOfPublication;

    public Book(String name, String author, int yehrOfPublication) {
        this.name = name;
        this.author = author;
        this.yehrOfPublication = yehrOfPublication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYehrOfPublication() {
        return yehrOfPublication;
    }

    public void setYehrOfPublication(int yehrOfPublication) {
        this.yehrOfPublication = yehrOfPublication;
    }

    public static void infoOut(String name, String author, int yehrOfPublication) {
        System.out.println("Книга под  названием : " + name);
        System.out.println("Уважаемого писателя " + author);
        System.out.println(yehrOfPublication + " года выпуска");
    }

    public static void antiquityCheck(int yehrOfPublication, int currentYehr) {
        String check = ((currentYehr - yehrOfPublication) > 50) ? "книге больше 50 лет" : "книге меньше 50 лет";
        System.out.println(check);
    }
}
