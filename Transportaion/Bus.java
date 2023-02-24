package Transportation;

import java.util.HashSet;
import java.util.Set;

public class Bus extends Transportation implements Change {

    //  변수
    static Set<Integer> numSet = new HashSet<Integer>();


    //    생성자
    Bus(int busNumber) {
        super();
        state = "운행";
        maxPassengers = 30;
        basicFare = 1000;

        if (!numSet.add(busNumber)) {       // 고유값 생성?
            System.out.printf("%d번은 이미 존재하는 버스 번호입니다.%n새로운 버스 번호를 지정해주세요.%n",busNumber);
        } else {
            numSet.add(busNumber);
            plateNumber = busNumber;
            System.out.printf("%d번 버스객체 만들어짐!%n",plateNumber);
        }

    }


    //  메서드
    @Override
    public void operate() {

        if (state.equals("차고지행")) {
            state = "운행";
            System.out.println("버스가 운행을 시작합니다.");
        }

    }

    @Override
    public void changeState() {
        if(state.equals("운행")){
            state = "차고지행";
        }else {
            state = "운행";
        }
    }

    @Override   // Change 인터페이스 implement
    public void changeSpeed(int plusMinusSpeed) {
        if (currentSpeed + plusMinusSpeed <= 0) {
            System.out.println("변경하려는 속도가 너무 느립니다.");
        } else {
            super.currentSpeed += plusMinusSpeed;
            System.out.printf("버스의 속도가 %dkm/s로 변경되었습니다.%n", currentSpeed);
        }

    }

    @Override // Change 인터페이스 implement
    public void changeFuel(int fuel) {      // 연료주입
        fuelAmount += fuel;

        System.out.println("상태: " + state);
        System.out.println("주유량 = " + fuelAmount);

        if (fuelAmount < 10) {
            System.out.println("주유가 필요합니다.");
        }
        if (fuelAmount <= 5) {
            System.out.println("연료가 떨어져 차고지로 가고 있습니다.");
            state = "차고지행";
            System.out.println("상태: " + state);
        }

    }


    public void board(int numOfPassengers) {    // 승객탑승
        if (state.equals("차고지행")){
            System.out.println("버스가 운행중이 아닙니다.");
        } else {
            if(currentPassengers+numOfPassengers>maxPassengers){
                System.out.println("최대 승객수를 초과했습니다.");
            }else {
                currentPassengers += numOfPassengers;
                earnedFare += numOfPassengers*basicFare;
                System.out.println("탑승 승객 수 = " + numOfPassengers);
                System.out.printf("잔여 승객 수 = %d%n",(maxPassengers-currentPassengers));
                System.out.println("요금 확인 = " + earnedFare);
            }
        }


    }
}
