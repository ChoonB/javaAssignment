package Transportation;

public class BusTest {
    public static void main(String[] args) {
//        버스 2대 생성
        Bus bus1 = new Bus(1234);
        Bus bus2 = new Bus(5678);
        Bus bus3 = new Bus(1234);

//        1. 버스 승객 +2
        bus1.board(2);
//        2. 주유량 -50
        bus1.changeFuel(-50);
//        3. 상태변경
        bus1.changeState();
//        4. 주유량 +10
        bus1.changeFuel(10);
//        5. 상태변경
        bus1.changeState();
//        6. 승객 +45 승객 수 초과
        bus1.board(45);
//        7. 승객 +5
        bus1.board(5);
//        8. 주유량 -55
        bus1.changeFuel(-55);

    }
}
