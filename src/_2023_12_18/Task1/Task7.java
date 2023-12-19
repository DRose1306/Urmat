package _2023_12_18.Task1;

public class Task7 {
    //Создайте функциональный интерфейс TextAnalyzer с методом analyze, который принимает текст и анализирует его, возвращая результат анализа.
    //Напишите метод, который принимает строку и TextAnalyzer, и подсчитывает количество уникальных слов в тексте.

    public static void main(String[] args) {
        int word = wordCount("PIF используется как как тест принятия решений руководства в области кадрового менеджмента. в", str -> {
            int count = 0;
            String[] array = str.split(" "); //снова не получилось получить более компактную запись
            for (int i = 0; i < array.length; i++) {
                if (!array[i].isEmpty()) {
                    count++;
                    for (int j = 0; j < array.length; j++) { //второе условие не соблюдается
                        if (array[i].equalsIgnoreCase(array[j])) {
                            array[j] = "";
                        }
                    }
                }
            }
            return count;
        });

        System.out.println(word);
    }

    static int wordCount(String str, TextAnalyzer textAnalyzer) {
        return textAnalyzer.analyze(str);
    }
}

@FunctionalInterface
interface TextAnalyzer {
    int analyze(String str);
}
