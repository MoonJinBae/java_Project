package chap_06;

public class _01_Method {
    // 메소드 정의
    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }


    public static void main(String[] args) {
        // 메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();    //  호출
        sayHello();    //  호출
        sayHello();    //  호출
        System.out.println("메소드 호출 후");

        // 메소드의 활용 : 짜여있는 메소드를 재활용 하여 코드량을 줄일 수 있고, 유지보수시 용이(error 메소드만 변경하면 수정 가능하기때문)
    }
}
