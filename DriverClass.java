package ATM;

import ATM.AtmFunctionality;
import ATM.AtmOperations;
import java.util.Scanner;

public class DriverClass {

  public static void menu(String name, Scanner sc, AtmOperations op) {
    int ch;
    System.out.println(
      "\n================== Welcome " +
      name +
      " ==================" +
      "  \n1)View Current Balance \n2)Withdraw \n3)Deposit \n4)View Mini Statement \n5)Exits"
    );

    System.out.print("Enter Your Choice :");
    ch = sc.nextInt();
    switch (ch) {
      case 1:
        System.out.println("\n================ view Balance ================");
        op.viewBalance();
        break;
      case 2:
        System.out.println(
          "\n================ Withdraw Amount ================"
        );
        System.out.print("Enter Amount to Withdraw : ");
        double withdraw = sc.nextDouble();
        op.withdrawAmount(withdraw);
        break;
      case 3:
        System.out.println(
          "\n================ Deposit Amount ================"
        );
        System.out.print("Enter Amount to Deposit : ");
        double deposit = sc.nextDouble();
        op.depositAmount(deposit);
        break;
      case 4:
        System.out.println(
          "\n================ Mini Statement ================"
        );
        op.miniStatement();
        break;
      case 5:
        System.out.println(
          "\nCollect Your ATM Card \nThank You for Visit The ATM"
        );
        System.exit(0);
        break;
      default:
        System.out.println("Please Enter Valid Choice ");
        break;
    }
  }

  public static void logIn(Scanner sc, AtmOperations op) {
    int atmNumber = 1234;
    int atmPin = 1509;

    System.out.print("Enter Your Name : ");
    String name = sc.next();
    System.out.print("Enter ATM Number : ");
    int number = sc.nextInt();
    System.out.print("Enter PIN : ");
    int pin = sc.nextInt();
    if (atmNumber == number && pin == atmPin) {
      System.out.println("😄 Successfully Proceed 😇");
      do {
        menu(name, sc, op);
      } while (true);
    } else if (atmNumber != number && pin != atmPin) {
      System.out.println("Please Enter Valid Information");
    } else if (atmNumber != number) {
      System.out.println("Invalid ATM Number");
    } else if (atmPin != pin) {
      System.out.println("Invalid PIN");
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AtmOperations op = new AtmFunctionality();
    logIn(sc, op);
  }
}
