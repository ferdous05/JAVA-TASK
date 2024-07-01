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
 class Box11{
private double height;
private double width;
private double depth;


 Box11(){
    System.out.println("Sorry You dont put anything");
      

}

 Box11(double height,double width,double depth){

this.height=height;
this.width=width;
this.depth=depth;

}
void setheight(double height){

this.height=height;

}
double getheight(){

return this.height;

}


void setWidth(double width){

this.width=width;

}
double getwidth(){

return this.width;

}


void setdepth(double depth){

this.depth=depth;

}
double getdepth(){

return this.depth;

}









}
public class Box {
    public static void main(String[] args) {
        
        Box11 my_box = new Box11();
       
        System.out.println(my_box.getheight());
        System.out.println(my_box.getwidth());
        System.out.println(my_box.getdepth());
        System.out.println("\n\n");
        
        
        Box11 my_box2 = new Box11(2.5,6.8,7.66);
        
           System.out.println(my_box2.getheight());
        System.out.println(my_box2.getwidth());
        System.out.println(my_box2.getdepth());
        
        
        
        
        
        
        
        
    }
    
}
