
package My_try;


public class Caat extends leve {
    private double x;
    private double y;
    
    Caat(int a, int b ,double x,double y){
    super(a,b);
    this.x=x;
    this.y=y;
    }
    
    
    public void setX(double x){
    
    this.x=x;
    
    }
    
    public void setY(double y){
    
    this.y=y;
    
    }
    
    
    public double getX(){
    
    return this.x;
    }
    
    
    public double getY(){
    
    return this.y;
    }
    
    
    public double getArea(){
    
    return ((this.x*this.y)*(getA()*getB()));
    
    }
    
         @Override
    public String toString() {
return "x: " + x + ", y: " + y+"A : "+ getA()+"\n B :" +getB(); }
}
   
    
    
}
