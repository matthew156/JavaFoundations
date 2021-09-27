public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready! ";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double cappucinoPrice = 3.99;
        double dripCoffeePrice = 4.50;
        double latte = 5.25;
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String  Sam = "Sam";
        String Jimmy = "Jimmy";
        String Noah = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrderSam = true;
        boolean isReadyOrderJimmy = false;
        boolean isReadyOrderNoah = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1 + pendingMessage); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if( isReadyOrderNoah ) {
            System.out.println(generalGreeting + Noah + readyMessage + displayTotalMessage +cappucinoPrice);
        } else {
            System.out.println(generalGreeting + Noah + pendingMessage);
        }
        if( isReadyOrderSam ) {
            System.out.println(generalGreeting + Sam + readyMessage + displayTotalMessage +(2*cappucinoPrice));
        } else {
            System.out.println(generalGreeting + Sam + pendingMessage);
        }
        System.out.println(generalGreeting + Jimmy + readyMessage + displayTotalMessage + (latte - dripCoffeePrice));
    }
}
