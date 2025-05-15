package HW4.Q2;

public class DivOperationNotSupported extends MatrixException {
    public DivOperationNotSupported() {
        super("Division of matrices is not defined.");
    }
}
