package PrimitivуTypes_2.lesson_2_4_18;

public class Main {
    public static void main(String[] args) {

    }
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 < a1.length && p2 < a2.length) {
            if (a1[p1] <= a2[p2]) {
                arr[p3] = a1[p1];
                p1++;
            } else {
                arr[p3] = a2[p2];
                p2++;
            }
            p3++;
        }
        while (p1 < a1.length) {
            arr[p3] = a1[p1];
            p1++;
            p3++;
        }
        while (p2 < a2.length) {
            arr[p3] = a2[p2];
            p2++;
            p3++;
        }
        return arr;
    }
}
