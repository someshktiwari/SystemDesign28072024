package AbstractFactory;

public class WindowsButton implements Button{
    @Override
    public void print() {
        System.out.println("Windows button created");
    }
}
