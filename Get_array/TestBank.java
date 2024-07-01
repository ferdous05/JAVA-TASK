
package Get_array;


public class TestBank {
    
    
    
    
    
    
    
    
    
    
   
    public static void main(String[] args) {
        Account a1 = new Account(132,"Abul",5030);
        Account a2 = new Account(142,"Kashem",4030);
        Account a3 = new Account(152,"Rahim",3500);
        Account a4 = new Account(162,"Abul",56600);
        Bank scb = new Bank(500);

        scb.addAccount(a1);
        scb.addAccount(a2);
        scb.addAccount(a3);
        scb.addAccount(a4);
        System.out.println("Total number of Accounts " +scb.getNumberOfAccount());
        System.out.println();
        scb.printAccountinfo(142);
        System.out.println();
        Account[] acc = scb.getAccounts();
        for (int i = 0;i< scb.getNumberOfAccount();i++){
            System.out.println(acc[i]);
        }

    }
}
    

