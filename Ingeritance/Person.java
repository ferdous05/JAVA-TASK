
package Ingeritance;


public class Person {
    
    private String name;
    private int age;
    private String address;
    
    public Person(String name, int age,String address){
    
    this.name=name;
    this.age=age;
    this.address=address;
    }
    
    public void Setname(String name){
    
    this.name=name;
    
    }
    
    public void Setage(int age){
    
    this.age=age;
    
    }
    
    
    
    public void SetAddejress(String address){
    
    this.address=address;
    
    }
    
    
    
    public String getname(){
    
    return this.name;
    }
    
    
    public int getage(){
    
    return this.age;
    }
    
    
    public String getAddress(){
    
    return this.address;
    }
    
    
}
