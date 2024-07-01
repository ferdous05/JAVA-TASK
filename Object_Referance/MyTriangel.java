
package Object_Referance;

public class MyTriangel {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

public  MyTriangel(int x1,int y1,int x2,int y2,int x3,int y3){

 v1= new MyPoint (x1,y1);
 v2= new MyPoint(x2,y2);
 v3= new MyPoint(x3,y3);

}

public MyTriangel(MyPoint v1,MyPoint v2,MyPoint v3){
this.v1=v1;
this.v2=v2;
this.v3=v3;
}

public void setV1(MyPoint v1){
this.v1=v1;

}
public void setV2(MyPoint v2){
this.v2=v2;

}
public void setV3(MyPoint v3){
this.v3=v3;

}

public MyPoint Getv1(MyPoint v1){

return this.v1;
}

public MyPoint Getv2(MyPoint v2){

return this.v2;
}


public MyPoint Getv3(MyPoint v3){

return this.v3;
}

  
public double getParamiter(){

 double dx=v1.getX()+v1.getY()+v2.getX()+v2.getY()+v3.getX()+v3.getY();

 return dx;
 
}




}