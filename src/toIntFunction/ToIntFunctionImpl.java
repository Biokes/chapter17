package toIntFunction;

import java.util.function.ToIntFunction;

public class ToIntFunctionImpl {
    public static void main(String[] args) {
        ToIntFunction<Integer> value = input->input.compareTo(900);
        System.out.println(value.applyAsInt(120));
    }
}
