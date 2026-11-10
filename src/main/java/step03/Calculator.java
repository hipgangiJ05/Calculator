package step03;

public class Calculator<T extends Number> {
    enum Oper {
        SUM, SUB, MUL, DIV
    }

    Number calcu (T a, T b, Oper c) {
        Number result = 0;
        if (b.doubleValue() == 0 && c == Oper.DIV) {
            System.out.print("0으로는 나눌 수 없습니다");
            return 0;
        }
        switch (c) {
            case SUM -> result = a.doubleValue() + b.doubleValue();
            case SUB -> result = a.doubleValue() - b.doubleValue();
            case MUL -> result = a.doubleValue() * b.doubleValue();
            case DIV -> result = a.doubleValue() / b.doubleValue();
        }
        return result;
    }

}
