
package Task_of;


public abstract class Shap {
    
    private String color;
    private boolean filled;
    
    
  public  Shap(){
        System.out.println("null");
    
    }
    
  public  Shap(String color ,boolean filed ){
this.color= color;
this.filled= filed;
    }
  public  String getColor(){
    
    return this.color;
    
    }
  
  
    public void setcolor(String color){
   this.color=color;
    
    }
    
      public  boolean isFilled(){
    
    return this.filled;
    
    }
    public void setfield( boolean filled){
    
    this.filled= filled;
    
    }
    
  public abstract double getArea();
  
  public abstract double getPerimeter();
  @Override
    
   public String toString (){
    
    return "color : "+color+"filled"+filled;
    }
    
    
}
