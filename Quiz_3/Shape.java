
package Quiz_3;


public class Shape {
    private double dimension1;
    private double dimension2;
    
    public Shape(double d1,double d2 ){
    this.dimension1=d1;
    this.dimension2=d2;
    }
    
    public void setdimension1(double d1){
    this.dimension1=d1;
    
    }
    public void setdimension2(double d2){
    this.dimension2=d2;
    
    }
    
    public double getdimension1(){
    return this.dimension1;
    }
    public double getdimension2(){
    return this.dimension2;
    }
     public String shape(){
    return "null";
    }
     
      public double getarea(){
    return 0;
    }
    
      
      @Override
      public String toString(){
      
      return "dimension1 :"+this.dimension1+"\n dimension2"+this.dimension2;
      
      }
    
    
    
}
