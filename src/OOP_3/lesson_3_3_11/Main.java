package OOP_3.lesson_3_3_11;

public class Main {
    public static class Cat {
        public void sayHello() {
            System.out.println("Мяу!");
        }
    }
    public static class Dog {
        public void sayHello() {
            System.out.println("Гав!");
        }
        public void catchCat (Cat cat) {
            System.out.println("Кошка поймана");
            sayHello();
            cat.sayHello();
        }
    }
}
