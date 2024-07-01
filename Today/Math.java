/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Today;

/**
 *
 * @author BC
 */
import java.util.Scanner;

public class Math {

    public static void main(String[] args) {

        
        Scanner red = new Scanner(System.in);
        
        
        System.out.print("enter the number : ");
       int tree = red.nextInt();

        int net = red.nextInt();

        if (tree>red)
                
                {
            System.out.println("The highest number : " + tree);
        } else {
            System.out.println("The highest number : " + net);
        }
    }

}
