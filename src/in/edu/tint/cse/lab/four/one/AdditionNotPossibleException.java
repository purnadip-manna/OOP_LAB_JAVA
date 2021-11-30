package in.edu.tint.cse.lab.four.one;

public class AdditionNotPossibleException extends Exception{
    @Override
    public String getMessage() {
        return "Addition Not Possible!";
    }
}
