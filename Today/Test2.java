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

public class Test2 {

    public static int getsum(int num) {

        int sum = 0;
        while (num != 0) {

            int r = num % 10;
            sum = sum + r;
            num = num / 10;
        }
        return sum;

    }
    
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int X,result;
    System.out.print("Enter the Value : ");
    X=scan.nextInt();
    
    result=getsum(X);
    
    System.out.print("The result : "+result);
    
    
    
    
    }
    
    
    

}
