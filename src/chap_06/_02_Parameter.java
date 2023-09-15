package chap_06;

public class _02_Parameter {
    public static void power(int number) { // parameter, 매개변수
        int result = number * number;
        System.out.println(number + " 의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값 parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 인수(인자)
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2,3); // 2 * 2 * 2 = 8
        powerByExp(3,3); // 3 * 3 * 3 = 27
        powerByExp(10,0); // 1
    }
}
