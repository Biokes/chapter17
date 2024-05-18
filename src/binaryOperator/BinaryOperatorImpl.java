package binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorImpl {
    public static void main(String[] args) {
        BinaryOperator<String> output = (micheal, melody)->micheal + " was whooped by " + melody;
        System.out.println(output.apply("mikel", "melody"));
    }
}
