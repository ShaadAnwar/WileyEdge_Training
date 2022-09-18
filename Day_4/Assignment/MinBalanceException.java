package Day_4.Assignment;

public class MinBalanceException extends Exception{
    String message;
    MinBalanceException(){
        message = "MinimumBalance Exception Occured";
    }
    @Override
    public String getMessage(){
     return message;
    }

    @Override
    public String toString(){
        return "Amount deposited less than Minimum Balance";
    }
}
