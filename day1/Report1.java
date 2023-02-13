public class Report1 {
    public static void main(String[] args) {
        //2-4. 다음 중 변수를 잘못 초기화 한 것은? 1,2,3,4
//        byte b = 256;  x. byte는 128까지 저장가능.
//        char c = ''; x. char에는 빈 값 저장 불가능
//        char answer = 'no'; x. char에는 글자 하나만 저장 가능.
//        float f = 3.14; float에는 접미사 f를 붙여야 한다.
        double d = 1.4e3f;
        System.out.println(d); // 1400.0


//2-7. 다음 문장들의 출력 결과를 적으세요. 오류가 있는 문장의 경우, '오류' 라고 적으세요.
        System.out.println("1" + "2");  // 12
        System.out.println(true + "");    //true
        System.out.println('A' + 'B');  // char A가 char B가 만난 값을 char가 저장못하므로 아스키코드로 A는 65, B는 66이므로 합인 131
        System.out.println('1' + 2);    // char 1이 int2와 만나 int로 형변환이 되어 아스키코드로 1은 49이므로 49+2 = 51
        System.out.println('1' + '2');  // 아스키코드로 1은 49, 2는 50 이므로 99
        System.out.println('J' + "ava");// 문자형J와 문자열ava가 합해져 String 값인 Java 출력
//        System.out.println(true + null); 오류.


//2-8. 아래는 변수 x, y, z의 값을 서로 바꾸는 예제이다. 결과와 같이 출력되도록 코드를 넣으세요.
        int x = 1;
        int y = 2;
        int z = 3;

        int tmp = 0;
        int tmp2 = 0;


        tmp = x; //tmp = 1
        x = y; // x = 2
        tmp2 = z; // tmp2 = 3
        y = z; // y = 3
        z = tmp; // z = 1


        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
//예상 결과 : x=2, y=3, z=1
