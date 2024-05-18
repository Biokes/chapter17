package function;

import java.util.function.Function;

public class FunctionImpl {
    public static void main(String[] args) {
        Function<String ,String> output = (name)->name+ "is a boy";
        System.out.println(output.apply("abbey"));add .

    }
}
