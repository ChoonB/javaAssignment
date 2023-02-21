package day3;

public class Exercise6_17 {

    int[] shuffle(int[] arr){
        int[] answer = arr;
        int tmp = 0;

        for (int i = 0; i < answer.length; i++) {
            tmp = answer[0];
            int random = (int)(Math.random()*arr.length);
            answer[0] = answer[random];
            answer[random] = tmp;
        }
        return answer;
    }

    public static void main(String[] args) {
        Exercise6_17 exercise = new Exercise6_17();
        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(java.util.Arrays.toString(original));

        int[] result = exercise.shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }
}
