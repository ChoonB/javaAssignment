package SOLID.SRP;

public class SubstractOperation extends Calculator {

    @Override
    int operate(String operator, int firNum, int secNum) {
        return firNum - secNum;
    }
}
