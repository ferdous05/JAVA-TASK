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

public class Input {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] net = new int[5];

        System.out.print("Enter the value : ");

        for (int i = 0; i < 5; i++) {
            net[i] = scan.nextInt();

        }

        System.out.print("The Resultl : ");

        for (int i = 0; i < 5; i++) {
            System.out.println(net[i]);

        }

    }

}
