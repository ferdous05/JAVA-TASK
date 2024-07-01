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


public class PTAC {

  
public static void generatePrime(int a, int b) {

        System.out.println("Primr Number : ");

        for (int i = a; i <= b; i++) {

            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }

    public static boolean isPrime(int N) {

        if (N == 0 || N == 1) {

            return false;

        } else {

            for (int i = 2; i < N; i++) {

                if (N % i == 0) {

                    return false;
                }

            }

            return true;
        }
    }
    
}