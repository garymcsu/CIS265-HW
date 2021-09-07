import java.util.Random;

public class CheckingAccount extends BankAccount implements Payable {
    private String firstName;
    private String lastName;
    private int ssn;
    private final double interest = 0.001;
    private int acctNumber;
    private double balance = 0.0;
    private String pin;

    CheckingAccount(String firstName, String lastName, int ssn, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        Random random = new Random();
        this.acctNumber = 1000000 + new Random().nextInt(9000000);
        this.pin = pin;
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
    public boolean makePayment(double amount, String name, String inputPin) {
        try {
            if (!inputPin.equals(pin)) {
                throw new PaymentFailedException("Payment Failed: wrong pin");
            }
            if (amount > balance) {
                throw new PaymentFailedException("Payment Failed: balance too low");
            }
            // TODO improve print
            System.out.println("Paid "+name+ " with $"+amount);
            return true;
        } catch (PaymentFailedException exception){
            System.out.println(exception.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return "Firstname: " + firstName
                + "\n" +
                "Lastname: " + lastName
                + "\n" +
                "Checking Account Number: " + acctNumber
                + "\n" +
                "Balance: " + balance
                + "\n" +
                "Interest: " + interest
                + "\n" +
                "Pin: " + pin;
    }
}

