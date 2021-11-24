package Streams_5.lesson_5_3_12;

import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                result +=scanner.nextDouble();
            } else {
                scanner.next();
            }
        }
        System.out.printf("%.6f", result);
    }
}
