/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Md;

/**
 *
 * @author BC
 */
 class Box3 {

    double hight;
    double depth;

    Box3() {

        System.out.print("this is over loading");
        

    }

    Box3(double H) {

        hight = H;
        depth = 10;

    }

    Box3(double H, double D) {

        hight = H;
        depth = D;

    }

    double getvaleHight() {

        return hight;

    }

    double getvaleDepth() {

        return depth;

    }

    double getvalue() {

        return hight * depth;

    }

}

public class Overloading {

    public static void main(String[] args) {
        Box3 mybox = new Box3();

       // System.out.println(" " + mybox.depth);
       // System.out.println(" " + mybox.hight);
        System.out.println(" " + mybox.getvaleDepth());
        System.out.println(" " + mybox.getvaleHight());
         System.out.println(" "+mybox.getvalue());
        System.out.println("\n\n");

        Box3 mybox2 = new Box3(2);

      //  System.out.println(" " + mybox2.hight);
       // System.out.println(" " + mybox2.depth);

        System.out.println(" " + mybox2.getvaleHight());
        System.out.println(" " + mybox2.getvaleDepth());

        System.out.println(" " + mybox2.getvalue());
        System.out.println("\n\n");

        Box3 mybox3 = new Box3(17.96);

       // System.out.println(" " + mybox3.hight);
      //  System.out.println(" " + mybox3.depth);

        System.out.println(" " + mybox3.getvaleHight());
        System.out.println(" " + mybox3.getvaleDepth());

        System.out.println(" " + mybox3.getvalue());
        
      

    }

}
