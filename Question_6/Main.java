package Question_6;

public class Main {
    public static void main(String[] args) {
        GeometricObject rect1 = new Rectangle(5, 10);
        GeometricObject rect2 = new Rectangle(3, 6);

        System.out.println("Rectangle 1: ");
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        System.out.println("Rectangle 2: ");
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());

        try {
            GeometricObject rect3 = new Rectangle(-2, 4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Rectangle rect4 = new Rectangle(4, 5);
            rect4.setWidth(-3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}