
package My_try;


public class String_Int {
    
private String name;
private int num;
private double num2;

public String_Int(String name, int num,double num2){
this.name=name;
this.num=num;
this.num2=num2;

}


public String_Int(){
this.name="null";
this.num=5;
this.num2=9.6;

}


public String_Int(String name){
this.name=name;

}

public void setName(String name){

this.name=name;
}

public void setInt (int num){

this.num=num;
}


public void setNum2(double num2){

this.num2=num2;
}
public String Getname(){

return this.name;
}


public int getInt(){

return this.num;
}

public double getdouble(){

return this.num2;
}

@Override
public String toString(){

return "Name:"+this.name+"\n Num:"+this.num+"\n Number2 :"+this.num2;
}



}
