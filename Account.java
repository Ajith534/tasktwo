package tasktwo;

public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        // Default balance is set to 0.0
        this.balance = 0.0;
    }

    // Two-argument constructor
    public Account(double initialBalance) {
        // Initialize balance with the provided value
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    // Example usage
    public static void main(String[] args) {
        // Creating an Account object using the no-argument constructor
        Account account1 = new Account();
        account1.displayBalance();

        // Creating an Account object using the two-argument constructor
        Account account2 = new Account(100.0);
        account2.displayBalance();

        // Performing deposit and withdrawal operations
        account1.deposit(50.0);
        account2.withdraw(30.0);
        account1.withdraw(20.0);

        // Displaying final balances
        account1.displayBalance();
        account2.displayBalance();
    }
}

