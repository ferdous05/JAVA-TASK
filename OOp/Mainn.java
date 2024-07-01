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
public class Mainn {
    public static void main(String[] args) {
        
        Point p = new Point (1,2);
         Point q = new Point (0,4);
         
         Line a = new Line(p,q);
         Line b = new Line (1,2,0,4);
        System.out.println(a);
        System.out.println(b);
        
        System.out.println("Length :  "+a.Length());
        System.out.println("Length :  "+b.Length());
        
        
    }
}
