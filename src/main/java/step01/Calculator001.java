package step01;

import java.util.Scanner;

public class Calculator001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (char end = 0; end != 'Y'; ) {
            System.out.print("첫 번째 숫자 입력: ");
            int nb1 = sc.nextInt();

            System.out.print("두 번째 숫자 입력: ");
            int nb2 = sc.nextInt();

            System.out.print("연산자 입력(+, -, *, /): ");
            char operator = sc.next().charAt(0);

            if (operator == '+') {
                System.out.print("결과: ");
                System.out.println(nb1 + nb2);
            } else if (operator == '-') {
                System.out.print("결과: ");
                System.out.println(nb1 - nb2);
            } else if (operator == '*') {
                System.out.print("결과: ");
                System.out.println((double) nb1 * nb2);
            } else if (operator == '/') {
                if (nb2 == 0) {
                    System.out.println("0으로는 나눌 수 없습니다.");
                } else {
                    System.out.print("결과: ");
                    System.out.println((double) nb1 / nb2);
                }
            }
            System.out.print("계산기를 끝내시겠습니까(Y/N): ");
            end = sc.next().charAt(0);
        }
    }
}
