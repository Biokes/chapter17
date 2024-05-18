package doubleBinary;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryImpl {
    public static void main(String[] args) {
        DoubleBinaryOperator output = (value1, value2)->value1*=value2;
        System.out.println(output.applyAsDouble(8, 10));
    }
}
