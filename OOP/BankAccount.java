package OOP;

import java.util.List;

public class BankAccount {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account = new Account("123", 500, "saving", "Alamin");
        Account a2 = new Account("124",1000, "current", "Rakib");
        Account a3 = new Account( "125",1500, "mudaraba", "Rahim");
        Account a4 = new Account("126", 2000, "student", "Karim");
        Account a5 = new Account( "127",2500, "fixed", "Sonali");

        bank.add(account);
        bank.add(a2);
        bank.add(a3);
        bank.add(a4);
        bank.add(a5);

        List<Account> accountList = bank.getAllAccount();
        for (Account ac : accountList) {
            System.out.println(ac);
        }

        bank.depositMoney(account, 500);
        bank.depositMoney(a2, 10);
        bank.depositMoney(a3, 1);
        bank.depositMoney(a4, 10);
        bank.depositMoney(a5, 100);
        List<Account> accountList2 = bank.getAllAccount();
        System.out.println("After deposit the money");
        for (Account ac : accountList2) {
            System.out.println(ac);
        }

        System.out.println("After withdraw the money");

        bank.withdrawMoney(a2, 10);
        bank.withdrawMoney(a3, 100);
        bank.withdrawMoney(a4, 101);
        bank.withdrawMoney(a5, 1000);
        bank.withdrawMoney(account, 100);

        List<Account> accountList3 = bank.getAllAccount();
        for (Account ac : accountList3) {
            System.out.println(ac);
        }


    }
}
