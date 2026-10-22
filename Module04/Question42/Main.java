import java.util.HashMap;
import java.util.Map;

class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();

    public void createAccount(int customerId, double initialDeposit) {
        accounts.put(customerId, initialDeposit);
        System.out.println("Created account for Customer " + customerId + " with balance: $" + initialDeposit);
    }

    public void deposit(int customerId, double amount) {
        if (accounts.containsKey(customerId)) {
            accounts.put(customerId, accounts.get(customerId) + amount);
            System.out.println("Deposited $" + amount + " to account " + customerId + ". New balance: $" + accounts.get(customerId));
        } else {
            System.out.println("Account not found: " + customerId);
        }
    }

    public void withdraw(int customerId, double amount) {
        if (accounts.containsKey(customerId)) {
            double current = accounts.get(customerId);
            if (current >= amount) {
                accounts.put(customerId, current - amount);
                System.out.println("Withdrew $" + amount + " from account " + customerId + ". New balance: $" + accounts.get(customerId));
            } else {
                System.out.println("Insufficient funds for customer " + customerId);
            }
        } else {
            System.out.println("Account not found: " + customerId);
        }
    }

    public void checkBalance(int customerId) {
        if (accounts.containsKey(customerId)) {
            System.out.println("Customer " + customerId + " balance: $" + accounts.get(customerId));
        } else {
            System.out.println("Account not found: " + customerId);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.createAccount(101, 500.0);
        bank.createAccount(102, 1200.0);

        bank.deposit(101, 250.0);
        bank.withdraw(101, 100.0);
        bank.checkBalance(101);
        bank.withdraw(102, 1500.0);
    }
}
