package ro.scoalainformala.shapes.domain;

public class Square extends Rectangle {

    private double length;
   public Square(double side) {
       super(side, side);
   }

    public double getPerimeter() {
        return length * 4;
    }
}
