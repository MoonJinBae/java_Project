package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        /* 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오.

           조건 : 키가 120cm 이상인 경우에만 탑승 가능
                 삼항 연산자 이용

                 실행결과 : 키가 115cm 이므로 탑승 불가능합니다
                           키가 121cm 이므로 탑승 가능합니다    */

       int height = 120;
       int child_1 = 115;
       int child_2 = 121;

       String a = ( height <= child_1 ) ? "탑승 가능합니다" : "탑승 불가능합니다";
       String b = ( height <= child_2 ) ? "탑승 가능합니다" : "탑승 불가능합니다";

       System.out.println("키가 " + child_1 + "cm 이므로 " + a);
       System.out.println("키가 " + child_2 + "cm 이므로 " + b);






    }
}
