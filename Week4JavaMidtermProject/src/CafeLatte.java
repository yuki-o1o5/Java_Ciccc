import java.util.Scanner;

public class CafeLatte {
  
  public static void main (String[] args){
    int menu = 1;
    int typeOfEspresso = 1;
    int numberOfShot = 1;
    int milkChoice = 1;
    int syrupChoice = 1;
    int hereToGo = 1;
    double output = 0;
    double tip = 0;
    String yesNo = "yes";
    Scanner sc = new Scanner(System.in);

  try {

    while(yesNo.equals("yes")){

      printMessage("Menu");
      // System.out.println("============== Menu ==============");
      System.out.println("1: Small cafe latte       /$4.45");
      System.out.println("2: Medium cafe latte      /$4.95");
      System.out.println("3: Large cafe latte       /$5.45");
      System.out.println("==================================");
      System.out.println("PLease enter your choice : ");
      menu = sc.nextInt();

      switch(menu){
        case 1:
        output = output + 4.45;
        break;
      
        case 2:
        output = output + 4.95;
        break;
      
        case 3:
        output = output + 5.45;
        break;
      
        default:
        System.exit(0);
      }

      printMessage("Type of Espresso");
      // System.out.println("======== Type of Espresso ========");
      System.out.println("1: Regular  /Free");
      System.out.println("2: Decaf    /Free");
      System.out.println("==================================");
      System.out.println("Which shots would you like?");
      typeOfEspresso = sc.nextInt();

      switch(typeOfEspresso){
        case 1:
        output = output + 0;
        break;
      
        case 2:
        output = output + 0;
        break;
      
        default:
        System.exit(0);
      }


      printMessage("Number of Shot");
      // System.out.println("========= Number of Shot =========");
      System.out.println("1: Double Shot        / Free");
      System.out.println("2: Single Shot        /-$0.5");
      System.out.println("3: Extra Single Shot  /+$0.6");
      System.out.println("4: Extra Double Shot  /+$1.25");
      System.out.println("==================================");
      System.out.println("How many shots would you like?");
      numberOfShot = sc.nextInt();

      switch(numberOfShot){
        case 1:
        output = output + 0;
        break;
      
        case 2:
        output = output - 0.5;
        break;

        case 3:
        output = output + 0.6;
        break;

        case 4:
        output = output + 1.25;
        break;
      
        default:
        System.exit(0);
      }

      printMessage("Milk Choice");
      // System.out.println("=========== Milk Choice ===========");
      System.out.println("1: Regular milk  /Free");
      System.out.println("2: Oat milk      /+$0.8");
      System.out.println("3: Almond milk   /+$0.8");
      System.out.println("===================================");
      System.out.println("Which milk would you like?");
      milkChoice = sc.nextInt();

      switch(milkChoice){
        case 1:
        output = output + 0;
        break;
      
        case 2:
        output = output + 0.8;
        break;
      
        case 3:
        output = output + 0.8;
        break;
      
        default:
        System.exit(0);
      }

      printMessage("Syrup Choice");
      // System.out.println("=========== Syrup Choice ===========");
      System.out.println("1: None        /Free");
      System.out.println("2: vanilla     /+$0.5");
      System.out.println("3: caramel     /+$0.5");
      System.out.println("4: hazelnut    /+$0.5");
      System.out.println("5: lavender    /+$0.5");
      System.out.println("===================================");
      System.out.println("Would you like add syrup?");
      syrupChoice = sc.nextInt();

      switch(syrupChoice){
        case 1:
        output = output + 0;
        break;
      
        case 2:
        output = output + 0.5;
        break;

        case 3:
        output = output + 0.5;
        break;

        case 4:
        output = output + 0.5;
        break;

        case 5:
        output = output + 0.5;
        break;
      
        default:
        System.exit(0);
      }

      printMessage("For here To go");
      // System.out.println("========= For here To go ==========");
      System.out.println("1: For Here           /Free");
      System.out.println("2: To Go(Cup Charge)  /+$0.25");
      System.out.println("===================================");
      System.out.println("For here or to go?");
      hereToGo = sc.nextInt();
      
      switch(hereToGo){
        case 1:
        output = output + 0;
        break;

        case 2:
        output = output + 0.25;
        break;

        default:
        System.exit(0);
      }

      
      System.out.println("Total cost is : " + output);

      while(yesNo.equals("yes")){
        System.out.println("Do you want to order another one?  (yes or no): ");
        yesNo = sc.next();

        if(yesNo.equals("yes")){
          break;
        }

        else if(yesNo.equals("no")){
          printMessage("Tip Choice");
          System.out.println("1: 10%");
          System.out.println("2: 15%");
          System.out.println("3: 20%");
          System.out.println("4: None");
          System.out.println("===================================");
          System.out.println("Do you want to pay tip?");
          tip = sc.nextInt();

          if(tip == 1){
            output = (output*1.12)*1.1;
          }

          else if(tip == 2){
            output = (output*1.12)*1.15;
          }

          else if(tip == 3){
            output = (output*1.12)*1.2;
          }

          else{
            output = output*1.12;
          }

          printMessage("Total Price");
          System.out.println("Total is " + (Math.ceil(output)));
          System.out.println("Thank you very much!");
          System.out.println("==================================");

        }
        else{
          System.out.println("Prease enter yes or no.");
          yesNo = "yes";

        }
      }
    }



  } catch (Exception e) {
      System.out.println("Something Went Wrong Sorry");



  } finally {

      // Closing Scanner Class Instance
      sc.close();
  }
}
public static void printMessage(String input) {
  System.out.println("========= " + input + " =========");
}
}



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