package PrimitivуTypes_2.lesson_2_4_17;

public class Main {
    public static void main(String[] args) {

    }
    public static void printOddNumbers(int[] arr) {
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 2) != 0) {
                if (flag) {
                    str.append(",");
                }
                str.append(arr[i]);
                flag = true;
            }
        }
        System.out.println(str.toString());
    }
}
