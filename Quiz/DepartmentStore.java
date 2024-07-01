/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

/**
 *
 * @author BC
 */
public class DepartmentStore {
    private String  DepartmentStore; 
    private String address;
    private Product[] productlist;
    private int numberofProduct;

DepartmentStore(){

System.out.println("sorry ");

}

DepartmentStore(String strorname , String Add){
    
    this.DepartmentStore = strorname;
    this.address = Add;
    
}


String Getstore (){

return this.DepartmentStore;
}

String GetAdd (){

return this.address;
}

void setstore (String strorname){
this.DepartmentStore=strorname;



}
void setadd (String Add){
this.address=Add;



}

void Addproduct(Product Product){
Product.getproductName();
Product.getbrandName();


}






}


