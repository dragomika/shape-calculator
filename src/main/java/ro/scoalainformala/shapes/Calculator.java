package ro.scoalainformala.shapes;

import ro.scoalainformala.shapes.domain.Circle;
import ro.scoalainformala.shapes.domain.Rectangle;
import ro.scoalainformala.shapes.domain.Square;
import ro.scoalainformala.shapes.domain.Triangle;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int choice = 0;

        do {
            System.out.println("Select a shape:");
            System.out.println("1. Triangle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Circle");
            System.out.println("5. Exit");

            choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Input the length of the first side (x): ");
                    double x = s.nextDouble();
                    System.out.println("Input the length of the second side (y): ");
                    double y = s.nextDouble();
                    System.out.println("Input the length of the third side (z): ");
                    double z = s.nextDouble();


                    if (x > 0 && (y + z) >= x) {

                        Triangle triangle = new Triangle(x, y, z);

                        double perimeter = triangle.getPerimeter();
                        System.out.println("Perimeter of the triangle: " + perimeter);

                        double area = triangle.getArea();
                        System.out.println("Area of the triangle: " + area);
                    } else {
                        System.out.println("Invalid triangle sides. Please ensure x > 0 and x + y >= z.");
                    } break;

                case 2:

                    System.out.println("Input the length: ");
                    double length = s.nextDouble();
                    System.out.println("Input the width: ");
                    double width = s.nextDouble();

                    if (length > 0) {
                        Rectangle rectangle = new Rectangle(length, width);
                        double rectanglePerimeter = rectangle.getPerimeter();
                        double rectangleArea = rectangle.getArea();
                        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                        System.out.println("Area of the rectangle: " + rectangleArea);
                    } else {
                        System.out.println("Invalid rectangle size. Please ensure length and width > 0.");
                    } break;

                case 3:

                    System.out.println("Input the side length: ");
                    float sideLength = s.nextFloat();

                    if (sideLength > 0) {
                        Square square = new Square(sideLength);
                        double squarePerimeter = square.getPerimeter();
                        double squareArea = square.getArea();
                        System.out.println("Perimeter of the square: " + squarePerimeter);
                        System.out.println("Area of the square: " + squareArea);
                    } else {
                        System.out.println("Invalid square size. Please ensure length > 0.");
                    } break;

                case 4:

                    System.out.println("Input the radius: ");
                    double radius = s.nextDouble();

                    if (radius > 0) {

                        Circle circle = new Circle(radius);
                        double circlePerimeter = circle.getPerimeter();
                        double circleArea = circle.getArea();
                        System.out.println("Perimeter of the circle: " + circlePerimeter);
                        System.out.println("Area of the circle: " + circleArea);
                    } else {
                        System.out.println("Invalid circle size. Please ensure radius > 0.");
                    } break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5) ;
    }
}
