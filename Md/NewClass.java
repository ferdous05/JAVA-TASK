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
 class tree {
    private double width;
    private double height;
    private double depth;
    
    
   tree() {
       width=1.0;
       height=2.0;
       depth=3.0;
   }
tree(double len){
        width=len;
       height=len;
       depth=len;
        
    }
tree(double width,double height,double depth){
        
        this.width= width;
        this.height= height;
        this.depth=depth;
        
        
    }
    tree(tree box){
        
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }
    
   double getwidth(){
        return width;
    }
  void setwidth(double width){
        this.width= width;
    }
  double getheight(){
        return height;
    }
 void setheight(double height){
        this.height= height;
    }
 double getdepth(){
        return depth;
    }
 void setdepth(double depth){
        this.depth= depth;
    }
 void setDim(double width ,double height,double depth){
        
        this.width=width;
        this.height=height;
        this.depth=depth;
        
    }
   /* public boolean eualTo(tree o){
        if((width == o.width)&&(height=o.height)&&(depth=o.depth))
        { 
            return true;
        }
        return false;
    */
    
    
}


public class NewClass {
    
      public static void main(String[] args) {
       tree b1= new tree();
        System.out.println(b1 +"==> Volume:"+b1.volume());
        System.out.println();
        
       tree b2 =new tree(3.0);
        System.out.println(b2 +"==> Volume:"+b2.volume());
        System.out.println();
        
        tree b3 =new tree(3.0,6.0,5.0);
        System.out.println(b3 +"==> Volume:"+b3.volume());
        System.out.println();
        
        tree b4 =new tree(b2);
        System.out.println(b4 +"==> Volume:"+b4.volume());
        System.out.println();
        
        System.out.println("Are b1 and b3 equal?"+ b1.equaTo(b2));
        System.out.println("Are b2 and b4 equal?"+ b2.equalTo(b4) );
        
        
        
        
        
    }
    
}
