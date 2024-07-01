/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOp;

/**
 *
 * @author BC
 */
import java.util.Scanner;

class net {

    double width;
    double hight;
    double depth;

}

public class Final {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int A, B, C;
        System.out.print("Enter the valu of A :");
        A = scan.nextInt();
        System.out.print("Enter the valu of B :");
        B = scan.nextInt();
        System.out.print("Enter the valu of C :");
        C = scan.nextInt();

        net mybox = new net();

        mybox.width = A;
        mybox.hight = B;
        mybox.depth = C;

        double M;
        M = mybox.width + mybox.hight + mybox.depth;
         System.out.print(M);
         System.out.print("\n\n");
         
         double X;
        
        net mybox2= new net();
       mybox2.width=5;
       mybox2.depth=5;
       mybox2.hight=5;
        X = mybox2.width + mybox2.hight + mybox2.depth;
        
         System.out.print(X);
       
       
        
        

       

    }

}
