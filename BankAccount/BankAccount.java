public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    public static int numOfAccounts = 0;
    public static double totalAmount = 0;
    private String user;

//*************CONSTRUCTOR *********************** */
    public BankAccount(String user, double checkingBalance, double savingsBalance) {
        this.user = user;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        totalAmount += checkingBalance + savingsBalance;
    }

//*************GET AND SET *********************** */
    public double getCheckingAccount(){
        return this.checkingBalance;
    }
    public double getSavingsAccount(){
        return this.savingsBalance;
    }
    public double depositCheckingAccount(double amount){
        return this.checkingBalance += amount;
    }
    public double depositSavingsAccount(double amount){
        return this.savingsBalance += amount;
    }
public double totalAmount(double amount){
    return totalAmount;
}
public String getUserName(){
    return this.user;
}

//******************METHODS*************************/
    public double withdrawCheckingAccount(double amount){
        return this.checkingBalance -= amount;
    }
    public double withdrawSavingsAccount(double amount){
     return this.savingsBalance -= amount;
    }
    public void displayAccount(){
        System.out.println("Welcome " + getUserName() + "!\n" + "Your Checking balance is: " + getCheckingAccount() + "\n" + "Your Savings balance is: " + getSavingsAccount());
    }

}