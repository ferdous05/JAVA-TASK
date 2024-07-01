package Mid_Lab;

public class Main {

    public static void main(String[] args) {

        Point a = new Point(1, 0);
        Point b = new Point(0, 5);
        Point c = new Point(2, 3);

        Triangle N = new Triangle(a, b, c);
        System.out.println(N.getTyep());

    }
}
