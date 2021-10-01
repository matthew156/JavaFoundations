public class Bat {
	private int batEnergy = 300;
	
	public void fly() {
		System.out.println("*Flying*");
		this.setBatEnergy(this.getBatEnergy() - 50);
		System.out.println(this.getBatEnergy());
	}
	
	public void eatHumans() {
		System.out.println("Oh no! the bat is eating a human!");
		this.setBatEnergy(this.getBatEnergy() + 25);
		System.out.println("New Energy level after eating human: " + this.getBatEnergy());
	}
	
	public void attackTown() {
		System.out.println("The bat is attacking the town!!!");
		this.setBatEnergy(this.getBatEnergy() - 100);
		System.out.println(this.getBatEnergy());
	}
	
	// Getter for bat energy level
	public int getBatEnergy() {
		return batEnergy;
	}
	
	// Setter for bat energy level
	public void setBatEnergy(int num) {
		batEnergy = num;
	}
}
