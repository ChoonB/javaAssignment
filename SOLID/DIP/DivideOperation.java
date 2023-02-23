package SOLID.DIP;

public class DivideOperation extends AbstractOperation {

    @Override
    int operate(int firNum, int secNum) {
        if (secNum == 0){
            return -999999;
        }
        return firNum/secNum;
    }
}
