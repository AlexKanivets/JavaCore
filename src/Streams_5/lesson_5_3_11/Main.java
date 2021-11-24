package Streams_5.lesson_5_3_11;


import java.io.*;
import java.nio.charset.Charset;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] bb = new byte[] {48, 49, 50, 51}; //0, 1, 2, 3
        ByteArrayInputStream bis = new ByteArrayInputStream(bb);
        System.out.println(readAsString(bis, Charset.forName("ASCII")));
    }

    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        StringBuilder string = new StringBuilder();
        Reader reader = new InputStreamReader(inputStream, charset);
        int in = 0;
        while ((in = reader.read()) != -1) {
            string.append((char) in);
        }

        return string.toString();
    }
}
