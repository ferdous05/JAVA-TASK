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
class Box2{

double hight;
double waite;
double depth;

 double volume(){
 
 double X;
 X=hight*waite*depth;
 
 return X;
 
 }


}

public class Reruningvalue {
    public static void main(String args[]){
    double M;
    Box2 my_box= new Box2();
    my_box.depth=5;
    my_box.hight=2;
    my_box.waite=3;
    M=my_box.volume();
    System.out.print("The result : "+M);
    
    }
}
