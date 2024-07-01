
package Quiz_3;


public class Circle extends Shape {
    private int circled;
    private int circleCounter;
    
    public Circle(double dimension1,double dimension2,  double radius){
        super(dimension1,dimension2);
    this.circled= (int)radius;
    this.circleCounter=0;
    }
    
    public void setRadius(double radius){
    this.circled= (int)radius;
    }
    public int getcircle(){
    return this.circled;
    }
     public int getcircleCounter(){
    return this.circleCounter++;
    }
     
     public String Circle(){
    return "null";
    }
     
     public double getArea(){
    return Math.PI*((getdimension1()*getdimension2()));
     
     }
    
    
}
