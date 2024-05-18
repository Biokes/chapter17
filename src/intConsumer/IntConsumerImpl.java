package intConsumer;

import java.util.function.IntConsumer;

public class IntConsumerImpl {
    public static void main(String[] args) {
        IntConsumer imput = (inputGiven)->inputGiven*=2;
        imput.accept(20);
    }
}
