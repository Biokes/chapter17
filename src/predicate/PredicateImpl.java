package predicate;

import java.util.function.Predicate;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<String> value = String::isBlank;
        System.out.println(value.test("abbey"));
    }
}