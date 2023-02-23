package SOLID.DIP;

public class MultiplyOperation extends AbstractOperation{

    @Override
    int operate(int firNum, int secNum) {
        return firNum*secNum;
    }
}
