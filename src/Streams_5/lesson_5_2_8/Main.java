package Streams_5.lesson_5_2_8;


import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{3, 2, 7, 10, 4, 5, 7});
        OutputStream outputStream = new ByteArrayOutputStream();
        print(inputStream, outputStream);
        System.out.println(inputStream.toString()+","+outputStream.toString());
    }

    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        int res = 0;
        while ((res = inputStream.read()) != -1) {
            if (res % 2 == 0) {
                outputStream.write(res);
            }
        }
        outputStream.flush();
    }
}
