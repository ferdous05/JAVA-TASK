
package MyComplex;


public class MyComplex {
    private double real;
  
    
    
   public MyComplex(){
    this.real=0.0;
   
    
    }
   
   public MyComplex(double real){
   this.real= real;
  
   }
   
   public double getReal(){
   return this.real;
   }
   
   public void setReal(double real){
   this.real= real;
   
   }
  
   
   public String toString(){
       
       return "real"+this.real;
       }
       
     
    
     }  
       
       
    
    

