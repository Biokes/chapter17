package supplier;

import java.util.function.Supplier;

public class SupplierImpl{
    public static void main(String[] args) {
        Supplier<Integer> output = ()->90;
        System.out.println(output.get());
    }
}
