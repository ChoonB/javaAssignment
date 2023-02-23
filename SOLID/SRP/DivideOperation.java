package SOLID.SRP;

public class DivideOperation extends Calculator {
    @Override
    int operate(String operator, int firNum, int secNum) {
        return firNum/secNum;
    }
}