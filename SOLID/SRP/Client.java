package SOLID.SRP;

public class Client {
    public static void main(String[] args) {
        Calculator addCalculator = new AddOperation();
        Calculator subtractCalculator = new SubstractOperation();
        Calculator multiplyCalculator = new MultiplyOperation();
        Calculator divideCalculator = new DivideOperation();

        int firNum = 140;
        int secNum = 60;

        String operator = "+";
        int answer = addCalculator.operate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "-";
        answer = subtractCalculator.operate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "*";
        answer = multiplyCalculator.operate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);

        operator = "/";
        answer = divideCalculator.operate(operator, firNum, secNum);
        System.out.println(operator + " answer = " + answer);
    }
}
