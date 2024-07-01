
package Ingeritance;


public class PartTime  extends  Employ {
    private double hours;
    private double rate;
    
    public PartTime(String name, int age,String address,String department,String desingnation,double hours,double rate){
   super(name,age,address,department,desingnation);
   this.hours= hours;
   this.rate=rate;
   
    }
    
    
    public void Sethours(double hours){
    this.hours= hours;
    }
    
    public void Setrate(double rate){
    this.rate= rate;
    }
    
    public double getHours(){
    
    return this.hours;
    }
    
    public double Getsalary(){

return this.hours*this.rate;

}
    
    
    
    public double getRate(){
    
    return this.rate;
    }
    public double salary(PartTime rate,PartTime y){
    return 
    }
    
    
    
    
}
