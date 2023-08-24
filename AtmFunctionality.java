package ATM;

import ATM.ATM;
import ATM.AtmOperations;
import java.util.HashMap;
import java.util.Map;

// 🉐  implement the interface of atmOperation
public class AtmFunctionality implements AtmOperations {

  ATM atm = new ATM();
// 🌟 hashMap use for the store records - > mini Statement
  Map<Double, String> miniState = new HashMap<Double, String>();

  @Override
  public void viewBalance() {
    System.out.print("\nAvailable Balance is : " + atm.getBalance());
  }

  @Override
  public void depositAmount(double depositAmount) {
    if (depositAmount > 0) {
      // 🌟
      miniState.put(depositAmount, " Amount Deposit🌛 ");
      System.out.print(depositAmount + " Successfully Deposited ");
      double newBalance = atm.getBalance() + depositAmount;
      atm.setBalance(newBalance);
      viewBalance();
    } else {
      System.out.println("Invalid Deposit Amount");
    }
  }

  @Override
  public void withdrawAmount(double withdrawAmount) {
    if (withdrawAmount % 500 == 0 ) {
      if (withdrawAmount > 0 && withdrawAmount < atm.getBalance()) {
        // 🌟
        miniState.put(withdrawAmount, " Amount Withdrawn 🌜");
        System.out.println(withdrawAmount + " Successfully Withdraw");
        double remainBal = atm.getBalance() - withdrawAmount;
        atm.setBalance(remainBal);
        viewBalance();
      } else {
        System.out.println("✖️ Insufficient Balance ✖️");
      }
    }
    else{
      System.out.println("Please Enter the Amount in multiple of 500 ");
    }
  }

  @Override
  public void miniStatement() {
    for (Map.Entry<Double, String> record : miniState.entrySet()) {
      System.out.println(record.getKey() + " <<= " + record.getValue());
    }
  }
}
