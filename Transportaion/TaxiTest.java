package Transportation;

public class TaxiTest {
    public static void main(String[] args) {
//        택시 2대 생성
        Taxi taxi1 = new Taxi(1234);
        Taxi taxi2 = new Taxi(5678);
        Taxi taxi3 = new Taxi(1234);
//        1. 승객+2
        taxi1.start(2,"서울역",2);
//        2. 주유량-80
        taxi1.changeFuel(-80);
//        3. 요금 결제
        taxi1.pay();
//        4. 승객+5
        taxi1.start(5, "구로디지털단지역", 12);
//        5. 승객 +3
        taxi1.start(3, "구로디지털단지역", 12);
//        6. 주유량-20
        taxi1.changeFuel(-20);
//        7. 요금 결제
        taxi1.pay();

    }
}
