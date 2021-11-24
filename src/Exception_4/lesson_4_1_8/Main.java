package Exception_4.lesson_4_1_8;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

    public static String getCallerClassAndMethodName() {
        if (new Exception().getStackTrace().length <= 2) {
            return null;
        }
        return new Exception().getStackTrace()[2].getClassName() + "#" + new Exception().getStackTrace()[2].getMethodName();
    }
}
