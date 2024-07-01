
package ArrayAccouunt;


public class Main {
    public static void main(String[] args) {
        
         Account A1 = new Account(1852,"Akram",5000);
     Account A2 = new Account(188,"ram",5080); 
     Account A3 = new Account(133,"Kuddus",50);
      Account A4 = new Account(133,"Munna",89500);
       Account A5 = new Account(134,"Akkash",5700);
     
       
       
       
       Bank scb= new Bank(500);
       scb.addAccount(A1);
       scb.addAccount(A2);
       scb.addAccount(A3);
scb.addAccount(A4);
scb.addAccount(A5);
scb.Printinfo(134);


Account[] Alpha = scb.getAccounts();

for (int i=0;i<scb.GetNumberOfAccounts();i++){
    System.out.println(Alpha[i]);

}

       



    }

}
