package SOLID.OCP;

public class DivideOperation extends AbstractOperation{
    @Override
    int operate(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

}
