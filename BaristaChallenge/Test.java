import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Bobby");
        Order order4 = new Order("Grumpy");
        Order order5 = new Order("Sammy");

        Item item1 = new Item("cappucino", 3.50);
        Item item2 = new Item("Iced Coffe", 2.50);
        Item item3 = new Item("Latte", 4.99);
        Item item4 = new Item("Drip Coffee", 5.20);

        order1.addItem(item2);
        order2.addItem(item3);
    }
}