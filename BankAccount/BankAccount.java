public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    public static int numOfAccounts = 0;
    private double totalAmount = checkingBalance + savingsBalance;


//*************CONSTRUCTOR *********************** */
    public BankAccount() {
        numOfAccounts++;
    }

//*************GET AND SET *********************** */
    public double getCheckingAccount(){
        return checkingBalance;
    }
    public double getSavingsAccount(){
        return savingsBalance;
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

//******************METHODS*************************/
    public double withdrawCheckingAccount(double amount){
        return this.checkingBalance -= amount;
    }
    public double withdrawSavingsAccount(double amount){
     return this.savingsBalance -= amount;
    }

}