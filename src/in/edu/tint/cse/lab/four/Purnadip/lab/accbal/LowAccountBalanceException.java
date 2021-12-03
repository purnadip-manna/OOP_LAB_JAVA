package lab.accbal;

public class LowAccountBalanceException extends Exception{
    @Override
    public String getMessage() {
        return "Account Balance is low!";
    }
}
