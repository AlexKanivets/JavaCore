package GenericsColections_6.lesson_6_2_11;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
// add some elements to the set
        set.add("Абырвалг");
        set.add("Главрыба");
        set.add("Преображенский");
        set.add("Булгаков");
        set.add("Собачье сердце");
        set.add("Друг человека");
        set.add("Управдом");
        set.add("Советские газеты");
        set.add("Шариков");
        Iterator<String> iterator = set.iterator();
        for (String s:set
        ) {
            iterator.next();
            System.out.println(s);
        }
    }
}
