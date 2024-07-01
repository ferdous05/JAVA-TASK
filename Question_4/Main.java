package Question_4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sides of the triangle (side1 side2 side3): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        Triangle tri = new Triangle(side1, side2, side3);

        System.out.println("Triangle Area: " + tri.area());
        System.out.println("Triangle Perimeter: " + tri.perimeter());

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());

        scanner.close();
    }
}