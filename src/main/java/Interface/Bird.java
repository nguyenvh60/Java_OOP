package Interface;

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }

    @Override
    public int getMaxHeight() {
        return 30;
    }
}
