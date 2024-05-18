package booleanSupplier;

import java.util.function.BooleanSupplier;

public class BooleanSupplierOmpl {
    public static void main(String[] args) {
        BooleanSupplier output = ()->true;
        System.out.println(output.getAsBoolean());

    }
}
