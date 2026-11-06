import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calcul clcu = new Calcul();

        System.out.println("첫번째 숫자 = ");
        double a = sc.nextDouble();

        System.out.println("두번째 숫자 = ");
        double b = sc.nextDouble();

        clcu.mul(a, b);
    }
}
