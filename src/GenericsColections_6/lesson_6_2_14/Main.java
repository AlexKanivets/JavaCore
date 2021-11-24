package GenericsColections_6.lesson_6_2_14;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("./src/main/test.txt");
        System.out.println(getSalesMap(reader));
    }

    public static Map<String, Long> getSalesMap(Reader reader) {
        Map<String, Long> map = new HashMap<>();
        Scanner scan = new Scanner(reader);
        while (scan.hasNext()){
            map.merge(scan.next(), scan.nextLong(), (a, b) -> a + b );
        }
        return map;
    }


}
