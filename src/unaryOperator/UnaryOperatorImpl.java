package unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorImpl {
    public static void main(String[] args) {
        UnaryOperator<String> input = (name)->name +" is a man";
        System.out.println("input.apply(\"abbey\") = " + input.apply("abbey"));
    }
}
