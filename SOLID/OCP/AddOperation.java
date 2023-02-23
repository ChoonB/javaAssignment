package SOLID.OCP;

public class AddOperation extends AbstractOperation{
    @Override
    int operate(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }
}