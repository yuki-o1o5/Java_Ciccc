import java.util.Scanner;

public class CafeLatte {
  
  public static void main (String[] args){
    int userChoice =0;
    int number1 = 1;
    int number2 = 2;
    int output =0;
    String yesNo = "yes";
  

  Scanner sc = new Scanner(System.in)

  try {

    while(true){

      System.out.println("============== Menu ==============");
      System.out.println("1: Small cafe latte       /$4.45");
      System.out.println("2: Small Ice cafe latte   /$4.45");
      System.out.println("3: Medium cafe latte      /$4.95");
      System.out.println("4: Medium Ice cafe latte  /$4.95");
      System.out.println("5: Large cafe latte       /$5.45");
      System.out.println("6: Large Ice cafe latte   /$5.45");
      System.out.println("==================================");
      System.out.println("PLease enter your choice : ");
      userChoice = sc.nextInt();

      System.out.println("======== Type of Espresso ========");
      System.out.println("1: Regular  /Free");
      System.out.println("2: Decaf    /Free");
      System.out.println("==================================");
      System.out.println("Which shots would you like?");
      userChoice = sc.nextInt();

      System.out.println("========= Number of Shot =========");
      System.out.println("1: Double Shot        / Free");
      System.out.println("2: Single Shot        /-$0.5");
      System.out.println("3: Extra Single Shot  /+$0.6");
      System.out.println("4: Extra Double Shot  /+$1.25");
      System.out.println("==================================");
      System.out.println("How many shots would you like?");
      userChoice = sc.nextInt();

      System.out.println("=========== Milk Choice ===========");
      System.out.println("1: Regular milk  /Free");
      System.out.println("2: Skim milk     /Free");
      System.out.println("3: Lactose milk  /Free");
      System.out.println("4: Oat milk      /+$0.8");
      System.out.println("5: Almond milk   /+$0.8");
      System.out.println("===================================");
      System.out.println("Which milk would you like?");
      userChoice = sc.nextInt();

      System.out.println("=========== Syrup Choice ===========");
      System.out.println("1: None        /Free");
      System.out.println("2: Half Sweet  /Free");
      System.out.println("3: vanilla     /+$0.5");
      System.out.println("4: caramel     /+$0.5");
      System.out.println("5: hazelnut    /+$0.5");
      System.out.println("5: lavender    /+$0.5");
      System.out.println("===================================");
      System.out.println("Would you like add syrup?");
      userChoice = sc.nextInt();

      System.out.println("========= For here To go =========");
      System.out.println("1: For Here           /Free");
      System.out.println("2: To Go(Cup Charge)  /+$0.25");
      System.out.println("===================================");
      System.out.println("For here? or To go?");
      userChoice = sc.nextInt();

// 7 add more order or Not?
// 8 Tip (10%, 15%, 20%)
// 9 Tax

      // Order cafe latte and Bill system

// 1 Cafe latte {hot small($4.45), hot medium(4.95), hot Large(5.45), ice small($4.45), ice medium(4.95), ice Large(5.45)}
// 2 Choose espresso {regular(for free), decaf(for free)}
// 3 Choose shot {single shot(-0.5), extra single shot(0.6), extra double shot(1.25)}
// 4 milk choice {regular milk(for free), skim milk(for free), lactose milk(for free), oat milk(0.8), almond milk(0.8)}
// 5 Syrup flavors{caramel(0.5), vanilla(0.5), hazelnut(0.5), lavender(0.5)}
// 6 for {here(for free), to go(0.25)}
// 7 add more order
// 8 Tip (10%, 15%, 20%)
// 9 Tax

    }

      }
  }
}
 