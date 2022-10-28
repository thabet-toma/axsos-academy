package zoo1;

public class Bat extends Mammal {
	public Bat(){
		this.energyLevel=300;
	}
	public void fly() {
		System.out.println("the bat is flying");
		energyLevel-=50;
	}
	public void eatHumans() {
		System.out.println("noooooo nowwooo");
		energyLevel+=25;
	}
	public void attackTown() {
		System.out.println("booom");
		energyLevel-=100;
	}
	

}
