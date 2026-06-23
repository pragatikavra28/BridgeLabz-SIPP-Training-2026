abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void displayAccountDetails() {
        System.out.println(accountNumber + " " + holderName + " " + balance);
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    double calculateInterest() {
        return getBalance() * interestRate / 100;
    }
}

class CurrentAccount extends BankAccount {
    private double monthlyBonusRate;

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.setAccountNumber("S123");
        s.setHolderName("Pragati");
        s.setBalance(10000);
        s.setInterestRate(5);
        s.deposit(2000);
        s.withdraw(1000);
        s.displayAccountDetails();
        System.out.println("Interest: " + s.calculateInterest());

        CurrentAccount c = new CurrentAccount();
        c.setAccountNumber("C456");
        c.setHolderName("Unnati");
        c.setBalance(15000);
        c.setMonthlyBonusRate(3);
        c.deposit(3000);
        c.withdraw(2000);
        c.displayAccountDetails();
        System.out.println("Interest: " + c.calculateInterest());
    }
}