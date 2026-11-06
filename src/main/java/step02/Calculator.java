package step02;

public class App {
    void sum(int nb1, int nb2) {
        int val1 = nb1 + nb2;
        System.out.println("값 = " + val1);
    }

    void sub(int nb1, int nb2) {
        int val2 = nb1 - nb2;
        System.out.println("값 = " + val2);
    }

    void mul(int nb1, int nb2) {
        double val3 = (double)nb1 * nb2;
        System.out.println("값 = " + val3);
    }

    void div(int nb1, int nb2) {
        if (nb2 == 0) {
            System.out.println("0으로 나눌 수 없습니다.");
        } else {
            double val4 = (double)nb1 / nb2;
            System.out.println("값 = " + val4);
        }
    }
}