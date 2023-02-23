package SOLID.LSP;

public class DivideOperation extends AbstractOperation {
    @Override
    public int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public boolean isInvalid(int secNum) {
        if(secNum == 0){
            valid = false;
        }
        return valid;
    }
}
