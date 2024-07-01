
package My_try;


public class One {
  int a;
int b;


public One (int a, int b){
this.a=a;
this.b=b;
}

   
public boolean equalTo(One n){

    if((this.a==n.a)&&(this.b==n.b))
        
        return true;
    else return false;
}

}
