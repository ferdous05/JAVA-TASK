/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOp;

/**
 *
 * @author BC
 */

class Boxes {
double hight;
double width;
double depth;
void volium(){

double X;
X=hight*width*depth;
System.out.print("The voliume : "+X);

}

}

public class My {
    
    
    public static void main(String [] args){
    Boxes my_box= new Boxes();
    my_box.width=4;
    my_box.hight=2;
    my_box.depth=2;
    my_box.volium();
    
    
    
    
    
    }









    
}
