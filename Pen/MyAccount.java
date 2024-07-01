package Pen;

class Account {

    private int accountNumber;
    private String accountname;
    private double balance;

    Account() {
        System.out.println("Sorry");

    }

    Account(int accountNumber, String accountname, double balance) {

        this.accountNumber = accountNumber;
        this.accountname = accountname;
        this.balance = balance;

    }

    void setAccountnumber(int accountNumber) {
        this.accountNumber = accountNumber;

    }

    void setAccountname(String accountname) {

        this.accountname = accountname;

    }

    void Setbal(double balance) {
        this.balance = balance;
    }

    int getAccountnumberr() {
        return accountNumber;
    }

    String getaccountname() {
        return this.accountname;

    }

    double getbal() {
        return this.balance;
    }
    
    
    @Override
    public String toString(){
     return "Account[accountNumber ="+accountNumber+",accountName = "+accountname+"balance="+balance+"]";
    
    }

}
