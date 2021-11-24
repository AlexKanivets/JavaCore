package FuncInterfaceStreamAPI_7.lesson_7_2_12;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed sodales consectetur purus at faucibus. Donec mi quam, tempor vel ipsum non, faucibus suscipit massa. Morbi lacinia velit blandit tincidunt efficitur. Vestibulum eget metus imperdiet sapien laoreet faucibus. Nunc eget vehicula mauris, ac auctor lorem. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer vel odio nec mi tempor dignissim.";
        Charset charset = Charset.forName("UTF-8");
        ByteArrayInputStream textInput = new ByteArrayInputStream(text.getBytes());
        System.setIn(textInput);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.lines()
                .map(w -> w.toLowerCase())
                .flatMap(l -> Stream.of(l.split("[^а-яА-Яa-zA-Z0-9]+")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .limit(10)
                .forEach(e -> System.out.println(e.getKey()));
    }


}
