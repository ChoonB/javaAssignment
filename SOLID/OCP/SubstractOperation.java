package SOLID.OCP;

public class SubstractOperation extends AbstractOperation {
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }
}