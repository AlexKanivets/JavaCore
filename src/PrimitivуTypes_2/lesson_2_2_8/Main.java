package PrimitivуTypes_2.lesson_2_2_8;

public class Main {
    public static void main(String[] args) {

    }
    public static class isPowerOfTwo {
        public static boolean isPowerOfTwo(int value) {
            return Integer.bitCount(Math.abs(value)) == 1;
        }
    }
}
