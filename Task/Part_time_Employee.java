
package Task;

public class Part_time_Employee extends FullTimeEmploy {
    
    private double hours;
    private double rate;
    Part_time_Employee(String name , int age, String address, String department,String desingnation, double basic,double allowance,double hours, double rate){ 
        
        
        super(name,age,address,department,desingnation,allowance,basic);
    
    this.hours= hours;
    this.rate=rate;
    
    }
    
    
    void sethour(double hours){
    this.hours=hours;
    
    }
   void setrate(double rate){
    this.rate=rate;
    
    }
  
   
   double gethours(){
   
       return this.hours;
   }
   
    double getrate(){
   
       return this.rate;
   }
    
    
    double salary( double hours,double rate ){
    
    return this.hours*this.rate;
    }
    
}
