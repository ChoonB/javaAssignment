package Transportation;

public abstract class Transportation {
//   필드
    int plateNumber;                      // 1. 차량번호
    int fuelAmount = 100;                 // 2. 주유량 0~100%
    int earnedFare = 0;                            // 3. 누적 요금    원
    int currentSpeed = 0;               // 4. 현재속도  km/h
    String state;                       // 5. 현재 상태
    int maxPassengers;                  // 6. 최대 승객 수
    int currentPassengers = 0;          // 7. 현재 승객 수
    int basicFare;                           // 8. 기본요금

//    생성자

    public Transportation() {
    }

    //    메서드
    public abstract void operate();                        // 1. 운행

    public abstract void changeState();     // 2. 상태변경


}
