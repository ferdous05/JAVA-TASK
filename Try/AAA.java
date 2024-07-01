/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try;

/**
 *
 * @author BC
 */
public class AAA {
    
    public static void main(String[] args) {
        String A= "Shekh;Shahnewaz";
        int index= A.indexOf(';');
        String Firstname = A.substring(0,index);
        String lastname = A.substring(index+1,A.length());
        System.out.println("first name :  "+ Firstname);
        System.out.println("Last name :  "+ lastname);
    }
    
}
