package _2023_12_18.Task1;

public class Task4 {
    //Создайте функциональный интерфейс UpperCaseConverter с методом convert, который преобразует строку в верхний регистр.
    //Напишите метод, который принимает строку и UpperCaseConverter интерфейс, и преобразует её в верхний регистр.
    public static void main(String[] args) {
        System.out.println(converToUpperCase("java", String::toUpperCase));
    }

    static String converToUpperCase(String str, UpperCaseConverter upperCaseConverter) {
        return upperCaseConverter.convert(str.toUpperCase());
    }
}

@FunctionalInterface
interface UpperCaseConverter {
    String convert(String str);
}
