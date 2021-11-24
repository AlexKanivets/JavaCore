package lesson_4_1_7;

import lesson_4_1_7.MyNewException;

public class Main {
    public static void main(String[] args) throws MyNewException {
        testExp();

    }
    public static void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
