/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Md;

/**
 *
 * @author BC
 */

class circle {

private double redius;
private String color;


circle(){

this.redius=10;
this.color="red";


}

circle(String c){

this.redius=10;
this.color=c;

}
void steup(double r,String c){

this.redius=10;
this.color=c;


}

double getvalueofredious(){


return this.redius;
}
String getvalueofstring(){
return this.color;

}  

double result(){
return this.redius+this.redius;

}



}
public class mytest2 {

    public static void main(String[] args) {
        
        circle mytask=new circle();
        
        System.out.println(" "+mytask.getvalueofredious());
        System.out.println(" "+mytask.getvalueofstring());
        System.out.println(" "+mytask.result());
        System.out.println("\n\n");
        
         circle mytask2=new circle("green");
        
        System.out.println(" "+mytask2.getvalueofredious());
        System.out.println(" "+mytask2.getvalueofstring());
        System.out.println(" "+mytask2.result());
        System.out.println("\n\n");
        
         circle mytask3=new circle("4.07");
        
        System.out.println(" "+mytask3.getvalueofredious());
        System.out.println(" "+mytask3.getvalueofstring());
        System.out.println(" "+mytask3.result());
        
        
        
        
        
        
    }

    
}
