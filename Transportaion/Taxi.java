package Transportation;

import java.util.HashSet;
import java.util.Set;

public class Taxi extends Transportation implements Change {
//    부모멤버
//    int plateNumber;                      // 1. 차량번호
//    int fuelAmount = 100;                 // 2. 주유량 0~100%
//    int earnedFare = 0;                            // 3. 누적 요금    원
//    int currentSpeed = 0;               // 4. 현재속도  km/h
//    String state;                       // 5. 현재 상태
//    int maxPassengers;                  // 6. 최대 승객 수
//    int currentPassengers = 0;          // 7. 현재 승객 수
//    int basicFare;                           // 8. 기본요금

    //    멤버변수
    static Set<Integer> numSet = new HashSet<Integer>();
    int ratePerDistance = 1000;
    int basicDistance = 1;
    String destination = "없음";
    int fareToBePaid = 0;


    Taxi(int taxiNumber) {
        super();

        state = "일반";
        basicFare = 3000;
        maxPassengers = 4;

        if (!numSet.add(taxiNumber)) {       // 고유값 생성?
            System.out.printf("%d번은 이미 존재하는 택시 번호입니다.%n새로운 택시 번호를 지정해주세요.%n", taxiNumber);
        } else {
            numSet.add(taxiNumber);
            plateNumber = taxiNumber;
            System.out.printf("%d번 택시 생성%n", plateNumber);
            System.out.println("주유량 = "+fuelAmount);
            System.out.println("상태: "+state);
        }

    }


    @Override
    public void operate() {
        if (state.equals("일반") || fuelAmount >= 10) {
            state = "운행중";
            System.out.println("택시가 운행 중 입니다.");
        } else {
            System.out.println("탑승불가");
            if(fuelAmount<10){
                state = "운행불가";
            }else {
                state = "일반";
            }

        }
    }

    @Override
    public void changeState() {
        if(fuelAmount < 10){
            state = "운행불가";
            System.out.println("상태: "+state);
            System.out.println("주유 필요");
        }

    }

    @Override
    public void changeSpeed(int Speed) {
        if (currentSpeed + Speed <= 0) {
            System.out.println("변경하려는 속도가 너무 느립니다.");
        } else {
            super.currentSpeed += Speed;
            System.out.printf("택시의 속도가 %dkm/s로 변경되었습니다.%n", currentSpeed);
        }

    }

    @Override
    public void changeFuel(int fuel) {
        fuelAmount += fuel;

        System.out.println("주유량 = " + fuelAmount);
        System.out.println("상태: " + state);


        if (fuelAmount < 0) {
            System.out.println("연료가 부족해 운행이 불가합니다.");
            state = "운행불가";
            System.out.println("상태: " + state);
        }

    }

    public void start(int numOfPassengers, String destination, int distanceToDestination) {
        operate();
        if(state.equals("운행중")){
            if (currentPassengers + numOfPassengers <= maxPassengers) {
                currentPassengers = numOfPassengers;
                this.destination = destination;
                fareToBePaid = basicFare + ratePerDistance*(distanceToDestination-basicDistance);
                System.out.println(state = "운행중");
                System.out.println("탑승 승객 수 = "+currentPassengers);
                System.out.println("잔여 승객 수 = "+(maxPassengers-currentPassengers));
                System.out.println("기본 요금 확인 = "+basicFare);
                System.out.println("목적지 = "+destination);
                System.out.println("목적지까지 거리 = "+distanceToDestination+"km");
                System.out.println("지불할 요금 = "+fareToBePaid);
                System.out.println("상태 = "+state);

            } else {
                System.out.println("최대 승객 수 초과");
                state = "일반";
                System.out.println("상태: " + state);
            }
        }


    }

    public void pay(){
        earnedFare += fareToBePaid;
        System.out.println("주유량 = "+ fuelAmount);
        System.out.println("누적요금 = " + earnedFare);
        currentPassengers = 0;
        changeState();

    }


}

