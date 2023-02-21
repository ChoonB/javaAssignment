package day3;

public class Exercise6_21 {
    /* (1) abs 메서드를 작성하시오. */
    int abs(int value){
        return Math.abs(value);
    }

    public static void main(String[] args) {
        Exercise6_21 exercise = new Exercise6_21();

        int value = 5;
        System.out.println(value + "의 절대값 :" + exercise.abs(value));
        value = -10;
        System.out.println(value + "의 절대값 :" + exercise.abs(value));
    }
}
//예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
