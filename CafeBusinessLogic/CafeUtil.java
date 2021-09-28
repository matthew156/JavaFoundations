import java.util.*;
public class CafeUtil{
    public int getStreakGoal(){
           int sum = 0;
           for(int i= 0; i<=10; i++){
               sum+= i;
           }
           return sum;
        }
    public double printPriceChart(String productName, double price, int maxNumber){
        System.out.println(productName);
        double sum = 0;
        for(int i = 1; i<=maxNumber; i++ ){
        sum += price;
        System.out.println(i + " " + sum);
        }
        return sum;
    }
    public double getOrderTotal(double[] items){
        double sum = 0;
        for(int i = 0; i<items.length; i++){
            sum+=items[i];
        }
        return sum;
    }
    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        for(int i=0; i<menu.size(); i++){
            System.out.println( i + " " + menu.get(i) + " -- $" + prices.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        String userName = System.console().readLine("Welcome! Please Enter your name: \n");
        customers.add(userName);
    }
}