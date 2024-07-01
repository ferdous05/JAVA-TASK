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
public class NewCl {
    
    public static int Mysum(int N int t){
    int sum=0;
    sum=t+N;
    return sum;
    
    }
    public static void main (String[] args){
    
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter the number : ");
    int x,y;
    int result;
    x=scan.nextInt();
    y=scan.nextInt();
    result=Mysum(x,y);
    System.out.print(" the Result : "+result);
    
    
    
    
    }
    
}
