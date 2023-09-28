package ro.scoalainformala.shapes.domain;

public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public void setR(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
