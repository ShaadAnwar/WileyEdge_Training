package Day_6.Assignment;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Shaad", BankAccount.AccountType.SAVINGS);
        double interest = 0;
        try {
            interest = bankAccount.calculateTotalInterest(-5000,3);
        } catch (DepositeAmountException e) {
            System.out.println(e);
        }
        System.out.println(interest);
    }
}
