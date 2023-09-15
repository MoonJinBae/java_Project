package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 중첩 반복문

        // 별 (*) 사각형 만들기
        /*
         *****
         *****
         *****
         *****
         *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         //  *
         //  **
         //  ***
         //  ****
         //  *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) { // for ( int j = 0 ; j < i + 1; j++) 로도 가능
                System.out.print("*");
            }
            System.out.println();
        }

        //       *
        //      **
        //     ***
        //    ****
        //   *****

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //   *****
        //    ****
        //     ***
        //      **
        //       *
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //   *****
        //   ****
        //   ***
        //   **
        //   *
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
