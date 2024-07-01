
package Kuddus;


public class Main {
    public static void main(String[] args) {
        Point A = new Point(2,5);
        Point B = new Point(2,6);
        
        System.out.println(A.toString());
       Line A1 = new Line(A,B);
        System.out.println(A1.Length());
        Line B1 = new Line (2,4,6,8);
        System.out.println(B1.Length());
    }
}
