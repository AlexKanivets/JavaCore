package GenericsColections_6.lesson_6_2_13;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);

        HashSet<Integer> s2 = new HashSet<>();
        s2.add(0);
        s2.add(1);
        s2.add(2);

        Set<Integer> result = symmetricDifference(s1,s2);
        System.out.println(result);
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        Set<T> s1 = new HashSet<T>(set1);
        s1.removeAll(set2);
        Set<T> s2 = new HashSet<T>(set2);
        s2.removeAll(set1);
        s1.addAll(s2);
        return s1;
    }
}
