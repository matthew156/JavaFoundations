import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items = new ArrayList<Item>(); // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order() {
        this.name = "Guest";
    }
    
     public Order( String name) {
    this.name = name;}



    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    
    // ORDER METHODS
    

public double getOrderTotal(){
    double total = 0.0;
    for(Item i: this.items) {
      total += i.getPrice();
    }
    return total;
}
public void setItems(ArrayList<Item> items){
    this.items = items;
}

public void addItem(Item item){
    this.items.add(item);
}

public void display(){
    System.out.printf("Customer Name: %s", this.name);
    for(Item i: this.items) {
      System.out.println(i.getName() + " - $" + i.getPrice());
    }
    System.out.println("Total: $" + this.getOrderTotal());
  }


    	// Most of your code will go here, 
    	// so implement the getters and setters first!
    
    // GETTERS & SETTERS
    public String getName(){
    return this.name;
  }

}

