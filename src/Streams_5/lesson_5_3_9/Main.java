package Streams_5.lesson_5_3_9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        while (true) {
            int byteIn = System.in.read();
            System.out.println(byteIn);
        }
    }
}
