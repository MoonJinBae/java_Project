package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("---------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요.");

        System.out.println("---------------");

        // enhanced for (for-each) 반복문 배열이나 리스트를 사용할때 유용
        for (String coffee : coffees) {  //coffee 라는 변수에 coffees 라는 배열을 입력해서 순서대로 사용
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요.");
    }
}
