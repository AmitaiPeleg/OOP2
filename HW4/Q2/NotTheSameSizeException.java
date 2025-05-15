package HW4.Q2;

public class NotTheSameSizeException extends MatrixException {
    public NotTheSameSizeException() {
        super("can not callculate if the sizes are diffrent");
    }
}
