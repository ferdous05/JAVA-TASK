
package Task;


public class FullTimeEmploy extends Employee{
    private double basic;
    private double allowance;


FullTimeEmploy(String name , int age, String address, String department,String desingnation, double basic,double allowance){
super(name,age,address,department,desingnation);
this.allowance=allowance;
this.basic=basic;
}

   
void setbasic(double basic){

this.basic=basic;
}

void setallow(double allowance){

this.allowance=allowance;
}

double getbasic(){

return this.basic;
}
double getallow(){

return this.allowance;
}

double Salary(double basic, double allowance){
 return this.basic+ (this.allowance/100);
    

}



}
