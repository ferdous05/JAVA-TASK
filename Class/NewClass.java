/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author BC
 */
class net{
 double cat;
 double rat;

net(){
cat=5;
rat=10;
}

net (double c){

cat=c;
rat=10;

}

   /* net(double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/


 net (double c,double r){
cat=c;
rat=r;
} 


double getvaleof_cat(){

return cat;


}
double getvaleof_rat(){

return rat;


}

double result (){

return cat*rat;

}





}


public class NewClass {
    
    
    
    public static void main(String[] args) {
         net you=new net();
         System.out.println(" "+you.cat);
         System.out.println(" "+you.rat);
         System.out.println(" "+you.getvaleof_cat());
         System.out.println(" "+you.getvaleof_rat());
         System.out.println(" "+you.result());
         System.out.println("\n\n");
         
         
        
         net you2=new net(7);
          System.out.println(" "+you2.cat);
         System.out.println(" "+you2.rat);
         System.out.println(" "+you2.getvaleof_cat());
         System.out.println(" "+you2.getvaleof_rat());
         System.out.println(" "+you2.result());
         System.out.println("\n\n");
         
      
        
           
         net you3=new net(5.0,13.0);
          System.out.println(" "+you3.cat);
         System.out.println(" "+you3.rat);
         System.out.println(" "+you3.getvaleof_cat());
         System.out.println(" "+you3.getvaleof_rat());
         System.out.println(" "+you3.result());
         System.out.println("\n\n");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
