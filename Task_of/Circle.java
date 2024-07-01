
package Task_of;

public class Circle extends Shap {
    private double  radius;
   
    
   public Circle(){
   super();
   this.radius=3.0;
   }
   
   public Circle ( double radius){
   super();
this.radius =radius;
   }
    
   public Circle( double radius, String color, boolean filled){
   super (color,filled);
   this.radius= radius;
  
   }
    
 public double getRadius(){
 return this.radius; 
  }
   
  public void setRadius(double radius){
  
  this.radius= radius;
  }
  public double getArea(){
  
  return Math.PI*radius*radius;
  }
  
  
  public double getPerimeter(){
  
  return 2*Math.PI*radius*radius;
  }
  
  @Override
    
   public String toString (){
    
    return "Radius : "+radius;
    }
    
  
  
    
}