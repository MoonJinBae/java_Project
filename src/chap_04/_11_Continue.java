package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 17번 손님이 노쇼
        for (int i = 1; i < 50; i++) {  // 손님 50명 대기중 이라고 가정
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue;
            }
            sold++;  // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
        }
        System.out.println("엽업을 종료합니다.");

        System.out.println("-----------------");

        // While 문
        sold = 0;
        int index = 0; // 손님 번호
        //while (index < 50) {  // 대기 손님 50명
        while (true) {  // 무한루프 탈출 조건이 있으면 "true" 를 사용 할 수 있음
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면? (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에거 기회가 넘어갑니다.");
                //index++; 밑에와 중복되므로 위쪽에 한번에 선언
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진 되었습니다.");
                break;
            }
            //index++; continue 사용으로 적용되지 않으므로 위쪽에 선언
        }
        System.out.println("영업을 종료 합니다.");
    }
}
