package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // break
        // 치킨집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)

        // for 문
        int max = 20;
        for (int i = 1; i <= 50; i++) { // 대기 하고 있는 손님 50명
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;   // 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-----------------");

        // While 문
        int index = 1; // 손님 대기 번호
        while (index <= 50) { // 대기 하고 있는 손님 50명
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("엽업을 종료 합니다.");
    }
}
