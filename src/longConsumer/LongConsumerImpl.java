package longConsumer;

import java.util.function.LongConsumer;

public class LongConsumerImpl {
    public static void main(String[] args) {
        LongConsumer longConsumer = (value)->value*=12345678890L;
        longConsumer.accept(123456789021L);
    }
}
