package ro.scoalainformala.shapes.domain;


public class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

    }



    public void setSideA(double sideA) {
        if (sideA > 0 && (sideB + sideC) >= sideA) {
            this.sideA = sideA;
        }
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double sp = getPerimeter() / 2;
        return Math.sqrt(sp * (sp - sideA) * (sp - sideB) * (sp - sideC));
    }
}
