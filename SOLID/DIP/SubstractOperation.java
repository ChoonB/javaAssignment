package SOLID.DIP;

public class SubstractOperation extends AbstractOperation{

    @Override
    int operate(int firNum, int secNum) {
        return firNum - secNum;
    }
}
