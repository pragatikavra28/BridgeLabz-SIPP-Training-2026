class BankAccount {
    private String accountNumber;
    private String holder;
    private double balance;
    static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    public void getStatement() {
        System.out.println("Account: " + accountNumber +
                ", Holder: " + holder +
                ", Balance: ₹" + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("101", "Pragati", 10000);
        BankAccount a2 = new BankAccount("102", "Aman", 15000);
        BankAccount a3 = new BankAccount("103", "Riya", 20000);

        a1.deposit(1000); a1.withdraw(500); a1.deposit(2000); a1.withdraw(3000); a1.deposit(700);
        a2.deposit(500); a2.withdraw(1000); a2.deposit(1200); a2.withdraw(200); a2.deposit(800);
        a3.deposit(2500); a3.withdraw(5000); a3.deposit(1000); a3.withdraw(700); a3.deposit(300);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts Created: " + BankAccount.totalAccounts);
    }
}
