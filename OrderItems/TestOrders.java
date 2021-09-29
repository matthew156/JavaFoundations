import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        // Menu items
        Item item1 = new Item();
        item1.name="capuccino";
        item1.price = 3.99;

        Item item2 = new Item();
        item2.name = "drip coffee";
        item2.price = 2.99;

        Item item3 = new Item();
        item3.name = "latte";
        item3.price = 1.99;

        Item item4 = new Item();
        item4.name = "iced coffee";
        item4.price = 3.99;
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = "Cindhuri";

        Order order2 = new Order();
        order2.name = "Jimmy";

        Order order3 = new Order();
        order3.name = "Noah";

        Order order4 = new Order();
        order4.name = "Sam";
        // Application Simulations
        order1.items.add(item1);
        order1.total += item1.price;

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item1);
        order3.total += item1.price;

        order4.items.add(item3);
        
        order1.ready = true;

        order4.items.add(item3);
        order4.items.add(item3);
        order4.total +=(2*item3.price);

        order2.ready = true;
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
