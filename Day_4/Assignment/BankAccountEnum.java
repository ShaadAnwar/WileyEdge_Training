package Day_4.Assignment;

public class BankAccountEnum  {
    enum AccountType {
        SAVING, CURRENT;
    }

    private  int accountId;
    private String accoundHolderName;
    private double openingBalance;
    private double currentBalance;
    private AccountType ac;
    private static double totalBalance;
    private static int ID;
    static {ID = 0;}

    BankAccountEnum(String accoundHolderName, double openingBalance,AccountType ac )throws MinBalanceException {
        this.accoundHolderName = accoundHolderName;
        this.ac = ac;
        if(ac == AccountType.SAVING && openingBalance < 500)
            throw new MinBalanceException();
        if(ac == AccountType.CURRENT && openingBalance < 1000)
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
        if(this.ac==AccountType.SAVING && (currentBalance-amount)<500){
            System.out.println("Insufficient Balance");
            return;
        }
        if(this.ac==AccountType.CURRENT && (currentBalance-amount)<1000){
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
