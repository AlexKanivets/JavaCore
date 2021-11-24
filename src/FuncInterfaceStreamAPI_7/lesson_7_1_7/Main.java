package FuncInterfaceStreamAPI_7.lesson_7_1_7;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Integer num = 27;
        System.out.println(num + " -> " + sqrt().apply(num));
    }

    public static UnaryOperator<Integer> sqrt() {
//        UnaryOperator<Integer> square = x -> x*x;
//        return square;
        return x -> x*x;
    }
}
