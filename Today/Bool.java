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
public class Bool {

    public static void main(String args[]) {
        int tree [][];
        tree = new int[3][4];

        tree[0][0] = 15;
        tree[1][0] = 50;
        tree[1][1] = 2;
        tree[2][0] = 36;
        tree[2][1] = 42;
        tree[2][2] = 110;
        tree[2][3] = 200;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col <4; col++) {

                System.out.print(" " + tree[row][col]);break;

            }
         System.out.println();

        }

    }
}
