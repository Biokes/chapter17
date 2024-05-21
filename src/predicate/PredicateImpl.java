package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateImpl {
    public static void main(String[] args) {
        Predicate<String> value = String::isBlank;
        System.out.println(value.test("abbey"));
        int total = IntStream.rangeClosed(1, 1000).sum();
        System.out.println("total = " + total);
        List<Integer> output = List.of();
        int[] evenNumbers = IntStream.rangeClosed(1, 50)
                .filter(PredicateImpl::isPrimeNumber)
                .toArray();
        Arrays.stream(evenNumbers).forEach(System.out::println);
    }
    private static boolean isPrimeNumber(int number) {
        int count = 0;
        for (int counter = 1; counter <= number; counter++) {
            if(number%counter==0)count++;
        }
        return count==2;
    }
}