
package Task_of;

public class Rectangle extends Shap {
    
    private double width;
    private double length;
    
    public Rectangle(){
    super();
    this.length=5.0;
    this.width=3.0;
    
    }
    public Rectangle(double width, double length,String color,boolean filled){
      super (color,filled);
      
      this.width=width;
      this.length=length;
        
    
    }
    
    
    public double getWidth(){
    return this.width;
    }
    
    public void setWidth(double width){
    
    this.width=width;
    }
    
    public double getLength(){
    return this.length;
    }
    
    public void setLength(double length){
    
    this.length=length;
    }
    
    public double getArea(){
    
    return length*width;
    }
    
     public double getPerimeter(){
    
    return 2*(length+width);
    }
    
    
    
    
     @Override
    
   public String toString (){
    
    return "width : "+width+"length"+length;
    }
    
    
    
}
