public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Matt", 250, 100);
        account1.displayAccount();
        account1.depositCheckingAccount(100);
        account1.depositSavingsAccount(100);
        account1.withdrawCheckingAccount(50);
        account1.withdrawSavingsAccount(50);
        System.out.println(BankAccount.numOfAccounts);
        System.out.println(BankAccount.totalAmount);
    }
}