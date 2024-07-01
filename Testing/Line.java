
package Kuddus;


public class Line {
private Point start;
private Point end;


Line (Point start,Point end){

this.start=start;
this.end=end;
}
Line(int x1,int y1,int x2,int y3){
start= new Point(x1,y1);
end= new Point (x2,y3);

}

void SetStart (Point start){
this.start=start;
}

void SetEnd (Point end){
this.end=end;
}

Point Getstart(){

return this.start;
}

Point Getend(){

return this.end;
}

double Length(){

double dx=start.getX()+end.getY();
double dy=end.getX()*end.getY();

return dx+dy;


}











}