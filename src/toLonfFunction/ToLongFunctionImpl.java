package toLonfFunction;

import java.util.function.ToLongFunction;

public class ToLongFunctionImpl {
    public static void main(String[] args) {
        ToLongFunction<Long> output = Long::longValue;
        System.out.println(output.applyAsLong(122L));
    }
}
