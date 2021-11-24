package Streams_5.lesson_5_2_7;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        byte[] input = {1, 2, -1, 10, 4};
        InputStream inputStream = new ByteArrayInputStream(input);
        int result = sumOfStream(inputStream);
        System.out.println(result);
    }

    private static int sumOfStream(InputStream inputStream) throws IOException {
        int in;
        int result = 0;
        while ((in = inputStream.read()) != -1) {
            result += (byte) in;
        }
        return result;
    }
}
