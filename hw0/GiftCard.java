public class GiftCard implements Payable {
    private String pin;
    private double balance = 0.0;

    GiftCard(double amount, String pin){
        this.pin = pin;
        this.balance = amount;
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
        return "Gift Card Pin: " + pin
                + "\n" +
                "Gift Card Balance: "+ balance;
    }
}
