package chap_01;

public class _Quiz_01_ {
    public static void main(String[] args) {

        // 버스 도착 정보를 출력하는 프로그램을 작성하십시오. 각 정보는 적절한 자료형의 변수에 정의합니다.
        /*정보
        * 버스 번호는 "1234", "상압08" 과 같은 형태
        * 남은 시간은 분 단위 (예: 3분, 5분)
        * 남은 거리는 km단위 (예: 1.5km, 0.8km) */
        /*실행결과
        1234번 버스
        약 3분 후 도착
        남은 거리 1.2km
        상암08번 버스
        약 5분 후 도착
        남은 거리 0.8km */

        int busNumber = 1234;
        int timeRequired = 3;
        float distanceRemaining = 1.2f;

        System.out.println(busNumber + "번 버스");
        System.out.println("약 "+ timeRequired + "분 후 도착");
        System.out.println("남은 거리 " + distanceRemaining + "km");

        String busNumber_1 = "상암08번";
        int timeRequired_1 = 5;
        String distanceRemaining_1 = String.valueOf(0.8) + "km";

        System.out.println(busNumber_1 + " 버스");
        System.out.println("약 " + timeRequired_1 + "분 후 도착");
        System.out.println("남은 거리 " + distanceRemaining_1);
    }
}
