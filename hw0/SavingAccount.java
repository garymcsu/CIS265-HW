import java.util.Random;

public class SavingAccount extends BankAccount {
    private String firstName;
    private String lastName;
    private int ssn;
    private final double interest = 0.01;
    private int acctNumber;
    private double balance;
    private String pin;
    // TODO implement code

    SavingAccount(String firstName, String lastName, int ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        Random random = new Random();
        acctNumber = 100000 + new Random().nextInt(900000);
        balance = 0.0;
    }

    public boolean withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new WithdrawFailedException("Withdraw Failed: balance too low...");
            } else {
                balance = balance - amount;
                System.out.println("Successfully withdrew " + "$" + amount);
                return true;
            }
        } catch (WithdrawFailedException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance = balance + amount;
        }
    }

    @Override
    public String toString() {
        return "Firstname: " + firstName
                + "\n" +
                "Lastname: " + lastName
                + "\n" +
                "Saving's Account Number: " + acctNumber
                + "\n" +
                "Balance: " + balance
                + "\n" +
                "Interest: " + interest;
    }

    //    public double getBalance() {
//        return balance;
//    }
}

