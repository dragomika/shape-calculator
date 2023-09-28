package ro.scoalainformala.shapes.domain;

import java.util.Scanner;

public class Triangle {

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

    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    public double calculateArea() {
        double sp = calculatePerimeter() / 2;
        return Math.sqrt(sp * (sp - sideA) * (sp - sideB) * (sp - sideC));
    }
}
