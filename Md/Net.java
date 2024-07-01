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
class Box5{
double width;
double height;
double depth;



Box5(){
width=9.30;

}
 void Setheight(double H){
 
 height=H;
 
 }
 
void Setdepth(double D){

depth=D;


}


double getwidth(){

return width;

}
double gethight(){

return height;

} 
double getdepth(){

return depth;


}





 
 
 
}



public class Net {
    
    public static void main (String[] args){
    
    Box5 my_box =new Box5();
    
    my_box.Setdepth(2);
    my_box.Setheight(4);
    my_box.Setwidth(8);
    
    double A;
    A=my_box.getdepth()+my_box.gethight()+my_box.getwidth();
    
    System.out.print("The result : "+A);
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
   }

