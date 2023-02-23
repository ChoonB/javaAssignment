package SOLID.OCP;

public class Calculator {
    public int calculate(AbstractOperation abstractOperation,int firstNumber, int secondNumber){
        return abstractOperation.operate(firstNumber,secondNumber);
    }
}