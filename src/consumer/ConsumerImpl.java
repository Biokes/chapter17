package consumer;

import java.util.function.Consumer;

import static java.lang.System.out;

public class ConsumerImpl {
    public static void main(String[] args) {
        Consumer<Integer> user = (value)->value*=10;
        user.accept(20);
    }
}
