/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ingeritance;

/**
 *
 * @author BC
 */
public class Employ extends Person {
    private String department;
      private String desingnation;
    
      
      Employ(String name, int age, String address,String department,String desingnation){
          super(name,age,address);
          this.department=department;
          this.desingnation=desingnation;
      
      }
      
      public String SetDeparment(String department){
      this.department=department;
      }
      public String Setdesingnation(String desingnation){
      this.desingnation=desingnation;
      }
      public String Getdepartment(){
      
      return this.department;
      
      }
      
      
      public String Getdesingnation(){
      
      return this.desingnation;
      
      }
      
      @Override
public String toString(){

return "Name :"+getname()+"\n age:"+getage()+"\n Address: "+getAddress();
} 

  
    
}
