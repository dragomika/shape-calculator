package ro.scoalainformala.shapes.domain;

public class Square {
    private double length;

    public Square(double length) {
        this.length = length;

    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double calculatePerimeter() {
        return length * 4;
    }

    public double calculateArea() {
        return length * length;
    }
}
