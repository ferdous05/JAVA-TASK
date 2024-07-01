/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try;

/**
 *
 * @author BC
 */
class complex2{
double A;
double B;
double i;//imagenry number 



complex2(){

    System.out.println("Sorry , You doon't put anything");
}

complex2(double A, double B,double i){

this.A=A;
this.B=B;
this.i=i;


}


void setA(double A){

this.A=A;

}

double getA(){
 return this.A;

}


void setB(double B){
this.B=B;

}

double getB(){

return this.B;

}
void setimagin(double i){

this.i=i;

}

double getimagine(){

return this.i;
}

double add(){

double c;

c=(A+(i*B));

return c;

}


double multi(){

return (A+(i*B))*(A+(i*B));
}



}



public class NewClass2 {
    public static void main(String[] args) {
          
        complex2 my=new complex2();
        System.out.println("Add of complex : "+my.add() );
        System.out.println("product of complex : "+my.multi());
        System.out.println("\n\n");
        
        complex2 my2=new complex2(5.3,5.8,9.8);
        System.out.println("Add of complex : "+my2.add() );
        System.out.println("product of complex : "+my2.multi());
        
        
        
        
    }
}
