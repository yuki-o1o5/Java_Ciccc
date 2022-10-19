import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide number of rows to print");
        int word = scanner.nextInt();
        for (int line = 0; line < word; line++){
          String print = '';
          for (int cha = 0; cha < cha- line; cha--){
            String print = print + '@';
          }
        System.out.println(word);
        }
}
}

