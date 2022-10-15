import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        System.out.println("input the number");
        number = sc.nextInt();
        System.out.println("Your answer is " + number*10);
    }
}



