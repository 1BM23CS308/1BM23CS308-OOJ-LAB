class Account {
    String customerName;
    String accountNumber;
    String accountType;
    double balance;


    public Account(String customerName, String accountNumber, String accountType, double initialBalance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}


class SavAcct extends Account {
    private double interestRate;


    public SavAcct(String customerName, String accountNumber, double initialBalance, double interestRate) {
        super(customerName, accountNumber, "Savings", initialBalance);
        this.interestRate = interestRate;
    }

    
    public void computeAndDepositInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


class CurAcct extends Account {
    private static final double MIN_BALANCE = 500.0;
    private static final double SERVICE_CHARGE = 50.0;

    
    public CurAcct(String customerName, String accountNumber, double initialBalance) {
        super(customerName, accountNumber, "Current", initialBalance);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            if (balance < MIN_BALANCE) {
                balance -= SERVICE_CHARGE;
                System.out.println("Service charge imposed: " + SERVICE_CHARGE);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}


public class Bank1 {
    public static void main(String[] args) {
        
        SavAcct savings = new SavAcct("Alice", "SAV123", 1000.0, 5.0);
        savings.deposit(200);
        savings.displayBalance();
        savings.computeAndDepositInterest();
        savings.displayBalance();
        savings.withdraw(100);
        savings.displayBalance();

        System.out.println();

        
        CurAcct current = new CurAcct("Bob", "CUR456", 600.0);
        current.deposit(300);
        current.displayBalance();
        current.withdraw(700);
        current.displayBalance();
        current.withdraw(100); 
        current.displayBalance();
    }
}