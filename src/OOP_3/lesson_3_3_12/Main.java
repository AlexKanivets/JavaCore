package OOP_3.lesson_3_3_12;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte)27,"Alexander","Kanivets", "Autosport");
        Human human3 = new Human((byte)27,"Alexander","Kanivets");
    }

    public static class Human {
        byte age;
        String name;
        String secondName;
        String favoriteSport;
        public Human () {
        }
        public Human (byte age, String name, String secondName, String favoriteSport) {
            this(age,name,secondName);
            this.favoriteSport = favoriteSport;
        }
        public Human (byte age, String name, String secondName) {
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }
    }
}
