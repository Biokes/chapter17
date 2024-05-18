package bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateImpl {
    public static void main(String[] args) {
        BiPredicate<String,String> variable = (valueGiven,value2)->valueGiven.isBlank()
                || value2.isBlank();
        System.out.println(variable.test("username", "user101"));
    }
}
