
package Point_line;


public class Line {
    private Point start;
    private Point end;
    
    public Line(Point start,Point end){
    
    this.start=start;
    this.end=end;
    }
    public Line (int x1, int y1,int x2,int y2){
    
    start= new Point(x1,y1);
    end= new Point(x2,y2);
    
    }

   
    public Point getStart() {
return this.start;
}
    
      public Point getEnd() {
return this.end;
}
    public void setStart(Point start) {
this.start = start;
}
    public void setEnd(Point end) {
this.end = end;
}
    
    public double getLength() {

int dx = start.GetX() + end.GetY()+start.GetY()+end.GetX();

return dx;
    }
   
    
     @Override
    public String toString() {
return "x1: " + this.end.GetX() + ", X2: " + this.start.GetX()+" Y1 :"+this.start.GetY()+"Y2 : "+this.end.GetY() ;
}
    
}