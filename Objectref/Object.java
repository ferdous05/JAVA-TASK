^/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objectref;

/**
 *
 * @author BC
 */
class obj{
int set;
int net;


obj(int s, int n){
this.set=s;
this.net=n;

}
boolean test(obj bol){

    if (this.set==bol.set && this.net==bol.net)
   return true;
else return false;


}



}

public class Object {
    public static void main(String[] args) {
        
        obj A = new obj(22,50);
        obj B= new obj (22,50);
        obj C = new obj (15,50);
        
        System.out.println(A.test(B));
        System.out.println("\n\n");
        
         System.out.println(A.test(C));
        
    }
}
