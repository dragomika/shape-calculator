package ro.scoalainformala.shapes.domain;

public class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public void setR(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
