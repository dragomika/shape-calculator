package ro.scoalainformala.shapes.domain;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length) {
        this.length = length;
        this.width = length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public double calculatePerimeter() {
        return (length + width) * 2;
    }

    public double calculateArea() {
        return length * width;
    }
}
