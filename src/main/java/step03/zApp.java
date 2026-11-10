package step03;

import java.util.ArrayList;
import java.util.Scanner;

public class zApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        zCalculator calculator = new zCalculator();
        ArrayList<Double> arr = calculator.getArr();

        while (true) {

            System.out.print("첫 번째 숫자 입력: ");
            int nb1 = sc.nextInt();

            System.out.print("두 번째 숫자 입력: ");
            int nb2 = sc.nextInt();

            System.out.print("연산자(+, -, *, /) 선택: ");
            char oper = sc.next().charAt(0);

            if (nb2 == 0 && oper == '/') {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                double result = calculator.calcu(nb1, nb2, oper);
                System.out.println("======\n값: " + result + "\n======");
            }

            System.out.println(arr);
            System.out.print("↑ 첫 번째 연산 값을 삭제하시겠습니까? (Y/N): ");
            char r = sc.next().charAt(0);

            if (r == 'Y') {
                calculator.remove();
                System.out.println(arr);
            }

            System.out.print("계산기를 종료하시겠습니까? (Y/N): ");
            char end = sc.next().charAt(0);
            if (end == 'Y') {
                break;
            }
        }
    }
}