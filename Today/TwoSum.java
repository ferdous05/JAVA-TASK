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

public class TwoSum {

    public static void troy(int num1, int num2) {
        int sum = 0;
        sum = num1 + num2;

       System.out.println("The result : " + sum);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X, Y, result;

        System.out.print("enter the value :");

        X = scan.nextInt();
        Y = scan.nextInt();

       troy(X, Y);

       
    }

}
