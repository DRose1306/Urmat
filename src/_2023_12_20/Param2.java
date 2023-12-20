package _2023_12_20;

public class Param2 {
    public static void main(String[] args) {
        Radio<String> radio = new Radio<>("888LLL");
        System.out.println(radio.getValue());


    }
}

class Radio<T> {
    private T value;

    public Radio(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "value=" + value +
                '}';
    }
}


