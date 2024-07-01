package Pen;

public class Main {

    public static void main(String[] args) {

        Account a1 = new Account(135, "you", 428);
        Account a2 = new Account(155, "youhh", 423);
        Account a3 = new Account(15, "youYY", 42);
        Account a4 = new Account(13, "yoYURUYu", 42988);

        Bank scb = new Bank(1000);
        scb.addAccount(a1);
        scb.addAccount(a2);
        scb.addAccount(a3);
        scb.addAccount(a4);

        System.out.println(scb.getNNoumber());
        scb.printAccountinfo(155);

        Account[] acc = scb.getAccounts();
        System.out.println();
        for (int i = 0; i < scb.getNNoumber(); i++) {

            System.out.println(acc[i]);
        }

    }

}
