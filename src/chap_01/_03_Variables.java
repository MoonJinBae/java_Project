package chap_01;

import java.sql.SQLOutput;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "진배";
        int hour = 15; //정수 사용시 int

        System.out.println(name + "님, 배송이 시작됩니다." + hour +"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "잔디";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = false;  //참, 거짓 boolean: true or false
        System.out.println("이번 시험은 합격 했을까요? " + pass);

        double d = 3.14123456789; //float 보다 더욱 정밀한 소수 계산 가능.
        float f = 3.14123456789F; //float 실수 사옹시 F 붙여줌.
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;  //21억 초과시 long 사용 L 붙여줌.
        System.out.println(l);

           /*정수 int -21억에서 21억 사이에 사용 그보다 큰 정수는 long 사용.
        정밀한 실수 사용시 double 아니면 float 사용.
        하나의 문자 사용시 캐릭터: char, 하나의 문자: String, 참과 거짓: boolean,
        데이터의 범위에 맞게 적절하게 사용.
         */

    }
}
