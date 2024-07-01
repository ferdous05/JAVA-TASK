package Pen;

public class Bank {

    private Account[] accounts;
    private int numOfAccount;

    Bank(int size) {
        accounts = new Account[size];

    }

    int getNNoumber() {

        return this.numOfAccount;
    }

    Account[] getAccounts() {

        return this.accounts;
    }

    void addAccount(Account account) {
        accounts[numOfAccount++] = account;

    }

    void printAccountinfo(int accountNumber) {
        System.out.println(" Account info : ");
        for (int i = 0; i < this.numOfAccount; i++) {
            if (accounts[i].getAccountnumberr() == accountNumber) {

                System.out.println(accounts[i]);

            }

        }

    }

}
