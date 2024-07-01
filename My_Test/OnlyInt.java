
package My_try;


public class OnlyInt {
    private int a;
    private int b;
    


   
    public OnlyInt(int a,int b){
 this.a=a;
 this.b=b;
 }

    
    
    public boolean eqals(OnlyInt i){
    if (i.a==this.a && i.b==this.b)
        
        return true;
    else 
        return false;
    
    }
    
    public OnlyInt(OnlyInt n){
    this.a=n.a;
    this.b=n.b;
    
    }
 
    
    
       public OnlyInt(int a){
 this.a=a;

 }
       

 
 
 
 
 public void Seta(int a){
 this.a=a;
 }
 
 public void Setb (int b){
 
 this.b=b;
 }
 
 public int getA(){
 return this.a;
 }
 
 public int getB(){
 return this.b;
 }
 
@Override

 public String toString(){
 
 return "A :"+this.a+"\n B:"+this.b;
 }
 
 
 
 
 
}
