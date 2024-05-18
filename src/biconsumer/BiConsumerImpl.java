package biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerImpl {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> output = (value,name)->value*=name;
        output.accept(12,5);
        System.out.println("output = " + output);
    }
}
