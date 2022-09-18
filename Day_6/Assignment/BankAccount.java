package Day_6.Assignment;

public class BankAccount {
    enum AccountType{
        SAVINGS,CURRENT;
        public double rate(AccountType ac){
            if(ac == AccountType.SAVINGS)
                return 4.25;
            return 0.0;
        }
    }
    private int accountId;
    private String accountHolderName;
    private AccountType ac;
    private double interstRate;
    private static int ID;
    static {ID = 0;}

    BankAccount(String accountHolderName, AccountType ac){
        this.accountId =++ID;
        this.accountHolderName = accountHolderName;
        this.ac = ac;
        this.interstRate = ac.rate(ac);
    }

    public double calculateTotalInterest(double amt, int years)throws DepositeAmountException{
        if(amt<0)
            throw new DepositeAmountException();
        if(ac == AccountType.SAVINGS)
            return amt*(interstRate/100)*years;
        return 0.0;
    }
}
