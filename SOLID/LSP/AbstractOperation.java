package SOLID.LSP;

public abstract class AbstractOperation {
        boolean valid = true;

    public abstract int operate(int firstNumber, int secondNumber);

    public abstract boolean isInvalid(int secNum);
}
