package step02;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calcu = new Calculator();
        ArrayList<Double> arr = calcu.getArr();

        while (true) {
            System.out.print("첫 번째 숫자 입력: ");
            double nb1 = sc.nextDouble();

            System.out.print("두 번째 숫자 입력: ");
            double nb2 = sc.nextDouble();

            System.out.print("연산자(+, -, *, /) 입력: ");
            char oper = sc.next().charAt(0);

            double result = calcu.calculator(nb1, nb2, oper);
            if (oper == '/' && nb2 == 0) {
                System.out.println("ERROR: 0으로는 나눌 수 없습니다");
                arr.remove(Double.POSITIVE_INFINITY);
            } else{
                System.out.println("------\n값 = " + result + "\n------");
            }

            System.out.print("이전 연산 값을 불러오시겠습니까? (Y/N): ");
            char a = sc.next().charAt(0);

            if (a ==  'Y')   {
            System.out.println(arr);
            System.out.print("초기 값을 삭제하시겠습니까? (Y/N): ");
            char b = sc.next().charAt(0);
            calcu.remove(b);
            }

            System.out.print("======\n계산기를 종료하시겠습니까? (Y/N): ");
            char end = sc.next().charAt(0);

            if (end == 'Y') {
                System.out.println("계산기를 종료합니다.");
                break;
            } {
                System.out.println("======\n");
            }
        }
    }
}


