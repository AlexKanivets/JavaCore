package OOP_3.lesson_3_5_6;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence answer = new OOP_3.lesson_3_5_6.Main.AsciiCharSequence(example);
        System.out.println("Последовательность - " + answer.toString());//Hello!
        System.out.println("Размер её - " + answer.length());//6
        System.out.println("Символ под № 1 - " + answer.charAt(1));//e
        System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
        //проверка на нарушение инкапсуляции private поля
        System.out.println(answer.toString());//Hello!
        example[0] = 74;
        System.out.println(answer.toString());//Hello!
    }
    public static class AsciiCharSequence implements java.lang.CharSequence {
        public byte[] arr;
        public AsciiCharSequence(byte[] arr){
            this.arr = arr.clone();
        }

        @Override
        public int length() {
            return arr.length;
        }

        @Override
        public char charAt(int index) {
            return (char)arr[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new OOP_3.lesson_3_5_6.Main.AsciiCharSequence(Arrays.copyOfRange(arr, start, end));
        }

        @Override
        public String toString() {
            return new String(arr);
        }
    }

}




