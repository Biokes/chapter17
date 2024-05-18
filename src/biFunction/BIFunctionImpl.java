package biFunction;

import java.util.function.BiFunction;

public class BIFunctionImpl {
    public static void main(String[] args) {
        BiFunction<Integer,Integer, Integer> biFunction = (num1, num2)->num1*num2;
        System.out.println("biFunction.apply(12,32) = " + biFunction.apply(12, 32));
    }
}
