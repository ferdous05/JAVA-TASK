
package Kuddus;


public class Point {

    private int x;
    private int y;
    
    
    Point()
    {
        System.out.println("Sorry you havn't input anythinig");
    
    }
    
    
    Point(int x, int y){
    this.x=x;
    this.y=y;
    }
    int getX(){
    
    return this.x;
    }
    
    
    int getY(){
return this.y;    
    
    }
    
  void SetX (int x){
  
  this.x=x;
  }  
    void SetY(int y){
    
    this.y=y;
    }
    
    public String toString(){

return "X :"+x+ ",Y : "+y;
        
}
    
    
    
    
}
