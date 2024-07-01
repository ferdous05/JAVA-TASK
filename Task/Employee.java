
package Task;


public class Employee extends Person{
    private String department;
    private String desingnation;
Employee(String name, int age, String address, String department, String desingnation){
super(name,age,address);
this.department=department;
this.desingnation=desingnation;
}
    void Setdepart(String department){
    this.department=department;
    
    }
    
    void Setdesignation(String desingnation){
    
    this.desingnation=desingnation;
    }
    
    String getdepart(){
    
    return this.department;
    }
    
    String getdesing(){
    return this.desingnation;
    }
    
    
    
}
