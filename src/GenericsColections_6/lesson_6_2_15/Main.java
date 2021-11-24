package GenericsColections_6.lesson_6_2_15;

import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ByteArrayInputStream bais = new ByteArrayInputStream("1 2 3 4 5 6 7 8 9 10".getBytes());
        System.setIn(bais);

        Scanner sc = new Scanner(System.in);
        Deque<Integer> array = new ArrayDeque<>();
        StringBuilder s = new StringBuilder();
        while (sc.hasNextInt()) {
            sc.next();
            if (sc.hasNextInt()) {
                array.addFirst(sc.nextInt());
            }
        }
        for (int i: array ) {
            s.append(i).append(" ");
        }
//        while (!array.isEmpty()) {
//            s.append(array.pop() + " ");
//        }
//        s.setLength(s.length() - 1);
        System.out.print(s.toString());
    }
}
