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

public class Product {
private String productName;
private String brandName;
private int price;
private int quantity;
private int productID;

Product(){

    System.out.println("Sorry you haven't inpute any thing");

}
Product(String productName, String brandName, int price, int quantity, int  productID){
this.productName=productName;
this.brandName =  brandName;
this.price = price;
this.quantity = quantity;
this.productID= productID;

}
String getproductName(){
return this.productName;

}

String getbrandName (){

return this.brandName;
}

int getprice(){

return this.price;
}

int getquantity (){

return this.quantity;

}

int getproductID(){

return this.productID;
}


void setProductName ( String productName){

    this.productName= productName;
    

}

void setBrandName ( String brandName){

    this.productName=brandName;
    

}


void setprice (int price){

this.price= price;

}
void setQuantity ( int quantity){

this.quantity= quantity;

}


void setProductId ( int productID){

this.productID=productID;

}

@Override

public String toString(){

return " "+productName+" "+brandName+" "+price+ " "+quantity+" "+productID;
   
}



    
}
