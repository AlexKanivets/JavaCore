package PrimitivуTypes_2.lesson_2_4_14;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

    }
    public static BigInteger factorial(int value) {
        if (value <= 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}
