package PrimitivуTypes_2.lesson_2_3_10;

public class Main {
    public static void main(String[] args) {

    }
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^a-zA-Z0-9]","");
        String revStr = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(revStr);
    }
}
