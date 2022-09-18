package Day_4.Assignment;

public class MainBankAccount {
    public static void main(String[] args) {

        //Question 1
        try {
            BankAccount shaad = new BankAccount("Shaad", 5000);
            BankAccount Jhony = new BankAccount("Jhony Depth", 1000);
            BankAccount Robert = new BankAccount("Robert Downey Jr", 2000);

            System.out.println(shaad.displayTotalBalance());

            shaad.depositeAmount(2000);
            Jhony.depositeAmount(2000);
            Robert.depositeAmount(2000);

            System.out.println(shaad.getCurrentBalance());
            System.out.println(Jhony.getCurrentBalance());
            System.out.println(Robert.getCurrentBalance());


            System.out.println(Robert.displayTotalBalance());

            shaad.withdrawAmount(10000);



        }
        catch (MinBalanceException e){
           // System.out.println("Amount entered less than 500");
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
