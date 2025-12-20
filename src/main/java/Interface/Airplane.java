package Interface;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }

    @Override
    public int getMaxHeight() {
        return 300;
    }
}
