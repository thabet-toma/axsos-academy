package zoo1;

public class Gorilla extends Mammal {
public void throwSomething() {
	System.out.println(" the gorilla is throwing somthing");
	energyLevel-=5;
	
}
public void eatBananas() {
	System.out.println(" the gorilla is eating banana");
	energyLevel+=10;
}
public void climb() {
	System.out.println("gorilla has climbed a tree and decrease its energy by 10");
	energyLevel-=10;
}
}
