package SOLID.OCP;

public class MultiplyOperation extends AbstractOperation{
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}