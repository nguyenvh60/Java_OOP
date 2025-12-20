package Interface;

public class Test {
    public static void main(String[] args) {
        Flyable flyable = new Bird();
        flyable.fly();
        flyable.getMaxHeight();

        Flyable flyable2 = new Airplane();
        flyable2.fly();
        flyable2.getMaxHeight();

    }
}
