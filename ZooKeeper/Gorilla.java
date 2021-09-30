public class Gorilla extends Mammal {



//METHODS
public void throwsomething(){
    System.out.println("Gorilla throw!");
    this.setEnergyLevel(this.getEnergyLevel()- 5);
    System.out.println(this.getEnergyLevel());
}
public void eatBannanas(){
    System.out.println("MMMHHH!");
    this.setEnergyLevel(this.getEnergyLevel()+5);
    System.out.println(this.getEnergyLevel());
}
public void climb(){
    System.out.println("*Climbing Tree*");
    this.setEnergyLevel(this.getEnergyLevel() - 10);
    System.out.println(this.getEnergyLevel());
}
}