class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;
    
    BankAccount(String holder, long accNo, double initial) {
        accountHolder = holder;
        accountNumber = accNo;
        balance = initial;
    }
    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    void displayBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Holder: " + accountHolder);
        System.out.printf("Balance: $%.2f%n", balance);
    }
}

public class ATMDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Jane Smith", 123456789, 1000);
        acc.deposit(500);
        acc.withdraw(200);
        acc.displayBalance();
    }
}
