
package Bank;


public class Bank {
    private Account[] accounts;
    private int numberOfAccount;
    public Bank(int size){
        accounts = new Account[size];
    }
    public int getNumberOfAccount(){
        return numberOfAccount;
    }
    public Account[] getAccounts(){
        return accounts;
    }
    public void addAccount(Account account){
        accounts[numberOfAccount++] = account;
    }
    public void printAccountinfo( int accountNumber){
        System.out.println("Account Information: ");
        for (int i = 0; i<numberOfAccount;i++){
            if (accounts[i].getAccountNumber() == accountNumber){
                System.out.println(accounts[i]);
            }
        }
    }
}
