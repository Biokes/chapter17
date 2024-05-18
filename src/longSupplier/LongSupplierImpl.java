package longSupplier;

import java.util.function.LongSupplier;

public class LongSupplierImpl {
    public static void main(String[] args) {
        LongSupplier longSupplier = ()-> 9922134321L;
        System.out.println(longSupplier.getAsLong());
    }
}
