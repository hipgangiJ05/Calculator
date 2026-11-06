package step02;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App calcu = new App();

        while (true) {
            System.out.print("첫 번째 숫자 입력: ");
            int nb1 = sc.nextInt();

            System.out.print("두 번째 숫자 입력: ");
            int nb2 = sc.nextInt();

            System.out.print("연산자(+, -, *, /) 입력: ");
            char oper = sc.next().charAt(0);

            switch (oper) {

                case '+':
                    calcu.sum(nb1, nb2);
                    break;

                case '-':
                    calcu.div(nb1, nb2);
                    break;

                case '*':
                    calcu.mul(nb1, nb2);
                    break;

                case '/':
                    calcu.div(nb1, nb2);
                    break;

            }

            System.out.print("계산기를 종료하시겠습니까? (Y/N): ");
            char end = sc.next().charAt(0);

            if (end == 'Y') {
                break;
            }
        }
    }
}


