
package Point_line;


public class Point {
    private int x;
    private int y;
    
    public Point (int x,int y){
    this.x=x;
    this.y=y;
    }
    
    public void SetX(int x){
    this.x=x;
    
    
    }
    
    public void SetY(int y){
    this.y=y;
    
    
    }
    
    public int GetX(){
    
    return this.x;
    }
    
    public int GetY(){
    
    return this.y;
    }
    
     @Override
    public String toString() {
return "x: " + x + ", y: " + y; }
}
   
    

