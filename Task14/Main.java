
package Task14;


public class Main {
      public static void main(String[] args) {
        MovablePoint a = new MovablePoint(5,9,9,8);
        a.moveRight();
        System.out.println(a);
        System.out.println();

        MovableCircle mc = new MovableCircle(7,8,1,3,9);
        mc.moveUp();
        System.out.println(mc);
        System.out.println();
    }
}

