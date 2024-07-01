package ArrayAccouunt;

public class Bank {

    private Account[] accounts;
    private int numberOfAccount;

    Bank(int size) {
        accounts = new Account[size];
    }

    int GetNumberOfAccounts() {
        return this.numberOfAccount;
    }

    Account[] getAccounts() {
        return accounts;
    }

    void addAccount(Account account) {
        accounts[numberOfAccount++] = account;
    }

    void Printinfo(int accountNumber) {
        for (int i = 0; i < numberOfAccount; i++) {
            if (accounts[i].getAccountnumberr() == accountNumber) {
                System.out.println(accounts[i]);
            }

        }

    }

}
