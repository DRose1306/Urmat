package _2024_02_12;


public class CircleQ {
    private double radius;
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
class CircleFormulas{
    private double radius;

    public CircleFormulas(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}

