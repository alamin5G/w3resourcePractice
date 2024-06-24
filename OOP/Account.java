package OOP;

public class Account {
    private String accountNumber;
    private double balance;
    private String accountType;
    private String accountName;
    private int deposit;
    private int withdraw;
    public Account(){

    };
    public Account(String accountNumber, double balance, String accountType, String accountName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double deposit) {
        this.balance += deposit;
    }

    public void withdraw(double withdraw) {
        this.balance -= withdraw;
    }

    @Override
    public String toString() {
        return "Account Information :" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                ", accountName='" + accountName + '\'' +
                '.';
    }
}
