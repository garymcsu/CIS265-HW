public abstract class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int ssn;

    abstract void deposit(double amount);

    public abstract boolean withdraw(double amount);
}

