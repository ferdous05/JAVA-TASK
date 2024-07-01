/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bank;

class Account {
    private int accountNumber;
    private String accountName;
    private double balance;
    public Account(int accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
    }
    int getAccountNumber() {
        return accountNumber;
    }
     void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    String getAccountName() {
        return accountName;
    }
    void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    double getBalance() {
        return balance;
    }
    void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account [accountNumber = " + accountNumber + ", accountName = " +
                accountName + ", balance = " + balance
                + "]";
    } 
}

