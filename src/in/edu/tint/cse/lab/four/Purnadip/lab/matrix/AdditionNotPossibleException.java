package lab.matrix;
public class AdditionNotPossibleException extends Exception{
    @Override
    public String getMessage() {
        return "Addition Not Possible!";
    }
}
