package Day_6.Assignment;

public class DepositeAmountException extends Exception {
    private String message;
    DepositeAmountException(){
        this.message = "Amount Deposited cannot be negative ";
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Invalid Amount Deposite Exception";
    }
}
