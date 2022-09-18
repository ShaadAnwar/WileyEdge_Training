package Day_4.Assignment;


public class MainBankAccountEnum {
    public static void main(String[] args)throws MinBalanceException {
        BankAccountEnum shaad = new BankAccountEnum("Shaad",500, BankAccountEnum.AccountType.SAVING);
        BankAccountEnum jhony = new BankAccountEnum("Shaad",5000, BankAccountEnum.AccountType.CURRENT);
        System.out.println(shaad.getCurrentBalance());
        System.out.println(shaad.displayTotalBalance());
        shaad.withdrawAmount(20);
        System.out.println(shaad.getCurrentBalance());
        jhony.withdrawAmount(200);

        System.out.println(jhony.getCurrentBalance());
        System.out.println(jhony.displayTotalBalance());
    }
}
