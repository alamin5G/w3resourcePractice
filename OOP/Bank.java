package OOP;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;
    private String branch;
    private List<Account> accountList;
    public Bank() {
        this.bankName = "IBBL Bank PLC.";
        this.branch = "";
        this.accountList = new ArrayList<Account>();
    }

    public void add(Account account) {
        this.accountList.add(account);
    }

    public void remove(Account account) {
        this.accountList.remove(account);
    }

    public List<Account> getAllAccount(){
        return accountList;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }
    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

}
