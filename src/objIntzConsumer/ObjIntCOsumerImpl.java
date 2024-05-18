package objIntzConsumer;

import java.util.function.ObjIntConsumer;

public class ObjIntCOsumerImpl {
    public static void main(String[] args) {
        ObjIntConsumer<Double> value = (valueGiven, number)->valueGiven+=number;
        value.accept(12.0,7);
    }
}
