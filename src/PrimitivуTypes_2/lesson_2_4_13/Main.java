package PrimitivуTypes_2.lesson_2_4_13;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i=1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
