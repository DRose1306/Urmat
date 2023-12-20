package _2023_12_20;

public class Param3 {
    public static void main(String[] args) {
//        Station<Integer, String> st = new Station<>(5, "5555");
//        Station<Character, Boolean> chB = new Station<>('c', true);

//        System.out.println(st.getValueT());
    }
}

class Station<T, V extends Number> {
    private T valueT;
    private V valueV;

    public Station(T valueT, V valueV) {
        this.valueT = valueT;
        this.valueV = valueV;
    }

    public T getValueT() {
        return valueT;
    }

    public V getValueV() {
        return valueV;
    }

    @Override
    public String toString() {
        return "Station{" +
                "valueT=" + valueT +
                ", valueV=" + valueV +
                '}';
    }
}