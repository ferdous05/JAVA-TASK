/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOp;

/**
 *
 * @author BC
 */
public class Line {
    private Point start;
    private Point end;
    
    public Line ( Point start, Point end){
        
        this.start= start;
        this.end=end;
    }
    
    public Line (int x1,int y1,int x2,int y2){
    
    start = new Point(x1,y2);
    start = new Point(x2,y2);
    
    }
    
    Point  getstart(){
    
    return start;
    }
     Point  getend(){
    
    return end;
    }
     
     void setStart ( Point start){
     this.start= start;
     
     }
     
       void setEnd (Point end){
     this.end= end;
     
     }
       
       double Length (){
       int dx=start.getx()+end.gety();
       int dy= start.getx()+end.gety();
       
       return dx+dy;
       }
     
     
     
}
