package FuncInterfaceStreamAPI_7.lesson_7_2_11;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "1", "-78", "678");
        findMinMax(stream, String::compareTo, (a, b) -> System.out.println(a + " " + b));
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> listStream = stream.sorted(order).collect(Collectors.toList());
        if (listStream.isEmpty()) {
            minMaxConsumer.accept(null, null);
        } else {
            minMaxConsumer.accept(listStream.get(0), listStream.get(listStream.size() - 1));
        }
    }
}
