/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectref;

/**
 *
 * @author BC
 */


    
    
 class Rectangle {
    private int width ;
    private int length ;
    
    
    
Rectangle (int w ,int l ){
        
        width = w ;
        length = l ; 
    } 
double getArea(Rectangle r){
       return (r.length* r.width) ; 
    }

}
    
    
    
    
    
   

public class Oscar {
 
    public static void main(String[] args) {
        
    Rectangle A = new Rectangle(15,5);
        System.out.println(" "+A.getArea(A));
    
    
    
    }
}
