package FuncInterfaceStreamAPI_7.lesson_7_1_9;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);

        String[] array = {"test", null, "DOUBLE TEST"}; //4 0 11
        Arrays.stream(array).map(safeStringLength).forEach(System.out::println);

        String testString = "multithreadingapproximation"; // 27
        String testString2 = "lambda"; // 6
        String testString3 = null; // 0
        System.out.println("safeStringLength = " + safeStringLength.apply(testString));
        System.out.println("safeStringLength = " + safeStringLength.apply(testString2));
        System.out.println("safeStringLength = " + safeStringLength.apply(testString3));
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {
        return x -> condition.test(x) ? ifTrue.apply(x): ifFalse.apply(x);
    }
}
