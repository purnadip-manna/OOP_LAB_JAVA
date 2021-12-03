package lab.accbal;

public class NegativeAccountBalanceException extends Exception{
    @Override
    public String getMessage() {
        return "Negative Account Balance Exception!";    
    }
}
