package doubleConsumer;

import java.util.function.DoubleConsumer;

public class DoubleConsumerImpl {
    public static void main(String[] args) {
        DoubleConsumer output = (valueGiven)->valueGiven*=12.9;
        output.accept(12);
        System.out.println("output = " + output);

    }
}
