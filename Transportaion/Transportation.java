package Transportation;

public abstract class Transportation {
//   필드
    int plateNumber;                      // 1. 차량번호
    int fuelAmount = 100;                 // 2. 주유량 0~100%
    int fare = 0;                            // 3. 누적 요금    원
    int currentSpeed = 0;               // 4. 현재속도  km/h
    String state;                       // 5. 현재 상태

//    생성자




    //    메서드
    public abstract void operate();                        // 1. 운행

    public abstract void changeState();     // 2. 상태변경


}
