package Day_4.Assignment;

public class BankAccount {

    private  int accountId;
    private String accoundHolderName;
    private double openingBalance;
    private double currentBalance;
    private static double totalBalance;
    private static int ID;
    static {ID = 0;}

    BankAccount(String accoundHolderName, double openingBalance )throws MinBalanceException {
        this.accoundHolderName = accoundHolderName;
        if(openingBalance < 500)
            throw new MinBalanceException();
        this.openingBalance = openingBalance;
        this.accountId =++ID;
        totalBalance +=this.openingBalance;
        this.currentBalance = openingBalance;
    }

    public void depositeAmount(double amount){
        this.currentBalance +=amount;
        totalBalance +=amount;
    }

    public void withdrawAmount(double amount){
        if(amount > currentBalance) {
            System.out.println("Insufficient Balance");
            return;
        }
        this.currentBalance -=amount;
        totalBalance -=amount;
    }

    public double getCurrentBalance(){
        return this.currentBalance;
    }

    public double displayTotalBalance(){
        return totalBalance;
    }
}
