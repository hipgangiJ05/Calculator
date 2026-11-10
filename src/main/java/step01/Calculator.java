package step01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        while (true) {

        System.out.print("첫번째 숫자 입력: ");
        String a = scanner.nextLine();
        int number1 = Integer.parseInt(a);

        System.out.print("두번째 숫자 입력: ");
        String b = scanner.nextLine();
        int number2 = Integer.parseInt(b);

        System.out.print("연산자 선택( +, -, *, / ): ");
        String operator = scanner.nextLine();

            switch (operator) {
            case "+":
                System.out.print(number1 + " ➕ " + number2 + " = ");
                System.out.println(number1 + number2);
                break;

            case "-" :
                System.out.print(number1 + " ➖ " + number2 + " = ");
                System.out.println(number1 - number2);
                break;

            case "*" :
                System.out.print(number1 + " ✖️ " + number2 + " = ");
                System.out.println((double)number1 * number2);
                break;

            case "/" :
                if (number2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다");
                } else {
                System.out.print(number1 + " ➗ " + number2 + " = ");
                System.out.println((double) number1 / number2);
                }
                break;
            }
            System.out.print("계산기를 종료하시겠습니까?(Y/N): ");
            String end = scanner.nextLine();

            if (end.equals("Y")) {
                break;
            }
        }
    }
}
