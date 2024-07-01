
package Mid_Lab;


public class Triangle {
    
    
private Point a;
private Point b;
private Point c;
private String type;

Triangle(int x1,int y1,int x2,int y2,int x3,int y3){
a= new Point(x1,y1);
b= new Point (x2,y2);
c= new Point (x3,y3);
}

Triangle(Point a, Point b, Point c){
this.a=a;
this.b=b;
this.c=c;
}
double getParamiter (){
double i= a.getX()+b.getX()+c.getX();
double j= b.getY()+b.getY()+c.getY();

double para= i+j;

return para;

}
   public String getTyep(){

       double i= a.getX()+b.getX()+c.getX();
double j= b.getY()+b.getY()+c.getY();
if(a==b && b==c){
    System.out.println("Equil");
}
//else  (a==b || a==c||b=c){
//}

       
       
return  "Sum : = "+(i+j);
        
}
   


      
}


    

