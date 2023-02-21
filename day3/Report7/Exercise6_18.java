package day3;

public class Exercise6_18 {

    boolean isNumber(String str){
        boolean answer = false;
        if(str=="" || str == null){
            return false;
        }
        String[] s = str.split("");

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].matches("[0-9]")){
                count++;
            }
        }
        if (count == str.length()){
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        Exercise6_18 exercise = new Exercise6_18();

        String str = "1231";
        System.out.println(str + " 는 숫자입니까? " + exercise.isNumber(str));
        str = "1234o";
        System.out.println(str + " 는 숫자입니까? " + exercise.isNumber(str));
    }
}
//예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false
