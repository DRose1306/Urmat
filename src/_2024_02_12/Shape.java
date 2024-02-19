package _2024_02_12;

// Нарушение SOLID:
public class Shape {
    private Type type;

    public Shape(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public double calculateArea() {
        double area = 0;
        if (type == Type.CIRCLE) {
            // Вычисление площади круга
            //area = ...
        } else if (type == Type.SQUARE) {
            // Вычисление площади квадрата
        }
        //else
        // Вычисление площади квадрата area = ...
        //        }
        return area;
    }
}

enum Type {
    CIRCLE,
    SQUARE
}
