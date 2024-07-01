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
class Ractangel{
private int width;
private int length;

Ractangel(int w, int I){
this.width=w;
this.length=I;
}

 Ractangel(){
 
     
     
     int n=this.length+this.width;
     
     System.out.println(" "+n);
 }

    
void setwide(int w){
this.width=w;
}

void setlength(int I){

this.length=I;


}
 double getwide (){
 
 return this.width;
 }
 
 double getlength(){
 return this.length;
 
 }
Ractangel(Ractangel r){
this.width=r.width;
this.length= r.length;



}


double getArea(Ractangel r){


 double n;
 n= this.length+this.width;
 
 return n;

}



}


public class Trying {
    public static void main(String[] args) {
        
        Ractangel alpha = new Ractangel(25,5);
            Ractangel a = new Ractangel();

        System.out.println(" "+a.getArea(alpha));
        
        
        
        
    }
}
