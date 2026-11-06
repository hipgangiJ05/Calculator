package step02;

import java.util.ArrayList;

public class Calculator {

    ArrayList<Double> arr = new ArrayList<>();


    public double calculator (double a, double b, char c) {
        double result = 0;
        switch (c) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                    result = a / b;
                break;
        }
        arr.add(result);
        return result;
    }

    public void remove () {
            arr.remove(0);
    }

     ArrayList<Double> getArr () {
      return this.arr;
    }

    void setArr(ArrayList<Double> arr){
        this.arr = arr;
    }
}