package longFunction;

import java.util.function.LongFunction;

public class LongFunctionImpl{
    public static void main(String[] args) {
        LongFunction<Long> consumer = (value)->value*90L;
        System.out.println(consumer.apply(12234234122311L));
    }
}
