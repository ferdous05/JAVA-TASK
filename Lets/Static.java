
package Lets;


class Mytry{

private String name;
private int StudentID;
static String University="North South University";

Mytry(){
    System.out.println("You haven't inpute any thing");
}
Mytry(String n, int I){
this.name=n;
this.StudentID=I;
}
void Setname  (String n){
this.name=n;

}

void SetID (int I){
this.StudentID=I;

}

String getname (){

return this.name;

}


int getID(){

return this.StudentID;

}


}


public class Static {
    
    public static void main(String[] args) {
        
        Mytry A =new Mytry("Youhna",2031096642);
        System.out.println(A.getID());
        System.out.println(A.getname());
        System.out.println(Mytry.University);

 System.out.println("\n\n");
Mytry B = new Mytry();
        System.out.println(B.getID());
        System.out.println(B.getname());
        System.out.println(Mytry.University);
        
    }
    
}
