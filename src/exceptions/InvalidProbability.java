package exceptions;

public class InvalidProbability extends Throwable {
    private final String msg;

    public InvalidProbability(String Msg) {
        this.msg = Msg;
    }

}
