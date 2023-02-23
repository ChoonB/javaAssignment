package SOLID.SRP;

public class MultiplyOperation extends Calculator {

    @Override
    int operate(String operator, int firNum, int secNum) {
        return firNum*secNum;
    }
}
