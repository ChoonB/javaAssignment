package day3;

public class Exercise6_20 {
    /* (1) max 메서드를 작성하시오 . */
    int max(int[] arr){
        if(arr == null || arr.length == 0){
            return -999999;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Exercise6_20 exercise = new Exercise6_20();
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+exercise.max(data));
        System.out.println("최대값 :"+exercise.max(null));
        System.out.println("최대값  :"+exercise.max(new int[]{})); // 크기가 0인 배열  }
    }
}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999


