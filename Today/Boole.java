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

public class Boole {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 System.out.print("Enter the Number ");
        int a;
        a = scan.nextInt();
        boolean net = false;
        int tree;
       
        for (int i = 2; i < a; i++) {

            if ((a % i )!= 0) {

                net = true;
            }
            if (net) {
                System.out.print("This is prime number ");break;

            }
            else {
            System.out.print("This is not prime number ");break;
            }
            

        }

    }
}
