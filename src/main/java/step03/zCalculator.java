package step03;

import java.util.ArrayList;

public class zCalculator {
    ArrayList<Double> arr = new ArrayList<>();
    public double calcu (int int1, int int2, char o){
        double result =0;
        switch (o) {
            case '+' :
                result = int1 + int2;
                break;
            case '-' :
                result =  int1 - int2;
                break;
            case '*' :
                result =  int1 * int2;
                break;
            case '/' :
                result =  int1 / int2;
                break;
        }
        arr.add(result);
        return result;
    }

    void remove () {
        arr.remove(0);
    }

    ArrayList<Double> getArr () {
        return this.arr;
    }

    void setArr (ArrayList<Double> arr) {
        this.arr = arr;
    }
}
