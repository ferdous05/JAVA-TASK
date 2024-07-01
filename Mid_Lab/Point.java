
package Mid_Lab;

public class Point {
    
    private int x;
    private int y;
    
    Point(){
        System.out.println("Soory");
    
    }
    
    Point (int x, int y){
    this.x=x;
    this.y=y;
    
    }

   
     int getX(){
    
    return this.x;
    }
       void SetX (int x){
  
  this.x=x;
  }
    
    
    int getY(){
return this.y;    
    
    }
    
  
    void SetY(int y){
    
    this.y=y;
    }
    
    double distance(Point another){
     double m= ((another.x*another.x)-(another.y*another.y));
     return m;
    
    }
    
      public String toString(){

return "X :"+x+ ",Y : "+y;
        
}
    
    
}
