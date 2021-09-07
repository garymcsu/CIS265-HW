import java.util.Random;

public class SavingAccount extends BankAccount {
    private final double interest = 0.01;
    private int acctNumber;
    private double balance;
    private String pin;
    // TODO implement code

    SavingAccount(String firstname, String lastName, int ssn) {
        Random random = new Random();
        acctNumber = 100000 + new Random().nextInt(900000);
        balance = 0.0;
    }

    public boolean withdraw(double amount) {
        try {
            if (amount > balance) {
                throw new WithdrawFailedException("Withdraw Failed: balance too low...");
            }
        } catch (WithdrawFailedException exception) {
            System.out.println(exception.getMessage());
        }
        balance = balance - amount;
        System.out.println("Successfully withdrew " + "$" + amount);
        return true;
    }

    public void deposit(double amount){
        if(amount > 0.0){
            balance = balance + amount;
        }
    }

//    public double getBalance() {
//        return balance;
//    }
}

