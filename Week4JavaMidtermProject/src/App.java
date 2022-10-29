public class App {
    public static void main(String[] args) throws Exception {
        CafeOrder order1 = new CafeOrder("Yuki", 0, "no");
        order1.orderCalculator();
        System.out.println(order1.tips);
    }
}