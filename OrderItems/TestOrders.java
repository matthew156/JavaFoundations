import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    class Items {
        public
    }
        // Order variables -- order1, order2 etc.
    class Orders {
        public String name;
        public double total;
        public boolean ready;
        ArrayList<String> items;
    }
    Orders order1 = new Orders();
    order1.name = "Cindhuri";
    Orders order2 = new Orders();
    order2.name = "Cindhuri";
    Orders order3 = new Orders();
    order3.name = "Cindhuri";
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
