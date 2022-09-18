package Day_6.Assignment;

public class InvalidEmailException extends Exception {
    private String msg;
    InvalidEmailException(){
        this.msg = "Invalid Email Entered";
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Invalid Email Exception";
    }
}
