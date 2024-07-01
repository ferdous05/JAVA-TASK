package My_try;


public class TakeFrist {
private Frist v1;
private Frist v2;
private Frist v3;


 public TakeFrist(Frist v1,Frist v2,Frist v3){
this.v1=v1;
this.v2=v2;
this.v3=v3;
} 

public void SetV1(Frist v1){
this.v1=v1;

}
public void SetV2(Frist v2){
this.v2=v2;

}
public void SetV3(Frist v3){
this.v3=v3;

}
 public Frist getV1(){
return this.v1;
}

public Frist getV2(){
return this.v2;
}
public Frist getV3(){
return this.v3;
}

 public TakeFrist (int a1, int b1,int a2, int b2, int a3, int b3){

v1= new Frist(a1,b1);
v2= new Frist(a2,b2);
v3= new Frist(a3,b3);


} 
public int getvale (){

return v1.getX()+v2.getY()+v1.getY()+v2.getX()+v3.getX()+v3.getY();

}

       @Override
    public String toString() {
return "x1: " +v1.getX()+ ", x2: " + v2.getX()+"\n X1 : "+v1.getY()+"\n X2: "+v2.getY()+"\n X3 : "+v3.getX()+"\n X3 :"+v3.getY(); }


}
