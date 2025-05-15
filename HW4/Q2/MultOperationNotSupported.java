package HW4.Q2;

public class MultOperationNotSupported extends MatrixException {
    public MultOperationNotSupported() {
        super("It's not possible to multiply the matrices.");
    }
}
