package ATM;

public class ATM {

  private double balance;
  private double deposit;
  private double withdraw;

  // 🌟 Default constructor
  public ATM() {}         

  public ATM(double initialBalance) {
    this.balance = initialBalance;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getDeposit() {
    return deposit;
  }

  public void setDeposit(double deposit) {
    this.deposit = deposit;
  }

  public double getWithdraw() {
    return withdraw;
  }

  public void setWithdraw(double withdraw) {
    this.withdraw = withdraw;
  }
}
