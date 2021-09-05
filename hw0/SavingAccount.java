public class SavingAccount extends BankAccount {
    String firstName;
    String lastName;
    int socialNum;
    int accountNumber;
    public SavingAccount(String first, String last, int social){
        // TODO generate 6-digit account number
        // TODO set initial account balance to 0 with 1% interest rate
        firstName = first;
        lastName = last;
        socialNum = social;
    }

    public boolean withdraw(double withdraw){
    }

    public void deposit(double amount){
    }
}
