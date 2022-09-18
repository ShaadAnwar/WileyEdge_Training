package Day_6.Assignment;

public class EmailValidation {
    public boolean isValid(String email) throws InvalidEmailException{
        String[] str = email.split("@");
        if(!email.contains("@") || (str.length!=2 || !str[1].equals("gmail.com"))){
                throw new InvalidEmailException();
        }
        return true;

    }

    public static void main(String[] args) {
        EmailValidation email = new EmailValidation();
        try {
            System.out.println(email.isValid("wiley@.gmail@1234"));
        }
        catch (InvalidEmailException e){
            System.out.println(e);
        }
    }
}
