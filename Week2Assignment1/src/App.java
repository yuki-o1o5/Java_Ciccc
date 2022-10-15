import Fruits.Fruits;

public class App {
    public static void main(String[] args) throws Exception {
        // Fruits fruits = new Fruits("lemon", "yellow", 5, "good", 10, 1);
        Fruits fruits = new Fruits();
        fruits.addQuantity(4,15);
        // fruits.removeQuantity(5,20);

        System.out.println(fruits.getWeight());

        // System.out.println(fruits.getQuantity());
    }
}
