
package Box;


public class Box {
    
    public double width;
    public double height;
    public double depth;
    
    public Box(){
    
        System.out.println("Null");
    }
    
    
    
    public Box(double len){
    
    this.depth=len;
    this.height=len;
    this.width=len;
    }
    public Box(double width,double height,double depth){
    this.height=height;
    this.depth=depth;
    this.width=width;
   }
    /*public Box(Box box){
    this.depth=box.depth;
    this.height=box.height;
    this.width= box.width;
    
    }*/

    
    public double getWidth(){
    
    return this.width;
    } 
    
    public double getHeight(){
    
    return this.height;
    } 
    
    
    public double getDepth(){
    
    return this.depth;
    } 
    
    public void setWidth(double width){
    
    this.width=width;
    
    }
    public void setHeight(double height){
    
    this.height=height;
    
    }
    
    public void setDepth(double depth){
    
    this.depth=depth;
    
    } 
    
    public void setDim(double width, double height,double depth){
    
    this.depth=depth;
    this.height=height;
    this.width= width;
    }
    
  boolean eqalto(Box o){
    if ((this.depth==o.depth) && (this.height==o.height) && (this.width== o.width))
    
        return true;
    else
        return false;
        }
    
    public double volume(){
    return this.depth+this.height+this.width;
    
    }
    
    
    @Override
    public String toString (){
     
        return "Hight: "+this.height+"\n Depth: "+this.depth+"\n Width : "+this.width;
    
    }
    
    
    
    
    
    
}
