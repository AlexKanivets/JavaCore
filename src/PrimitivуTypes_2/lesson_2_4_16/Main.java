package PrimitivуTypes_2.lesson_2_4_16;

public class Main {
    public static void main(String[] args) {

    }
    public int[] evenArray(int number) {
        int[] arr = new int[number/2];
        int a = 0;
        for (int i = 1; i <= number; i++) {
            if ((i % 2) == 0) {
                arr[a] = i;
                a++;
            }
        }
        return arr;
    }
}
