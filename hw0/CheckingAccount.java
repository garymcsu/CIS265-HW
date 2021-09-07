import java.util.Random;

public class CheckingAccount extends BankAccount implements Payable {
    private final double interest = 0.001;
    private int acctNumber;
    private double balance;
    private String pin;

    CheckingAccount(String firstname, String lastName, int ssn, String pin) {
        Random random = new Random();
        acctNumber = 1000000 + new Random().nextInt(9000000);
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

    public boolean makePayment(double amount, String name, String inputPin) {
        if(!inputPin.equals(pin)){
            return false;
        }
        if(amount > balance){
            return false;
        }
        // TODO improve print
        System.out.println("Made Payment");
        return true;
    }
}
