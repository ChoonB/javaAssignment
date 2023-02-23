package SOLID.DIP;

public class AddOperation extends AbstractOperation{

    @Override
    int operate(int firNum, int secNum) {
        return firNum+secNum;
    }
}
