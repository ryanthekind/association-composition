package association.composition4;

public class Main {

	public static void main(String[] args) {
		
		Room bedroom = new Room("Medium", "Yellow", true);
		
		House myHouse = new House("Victorian", 1877, bedroom);
		
		//myHouse.toString(); // nothing happened...
		
		System.out.println(myHouse.getDesign());
		System.out.println(myHouse.toString()); // adding this.getRoom prints the memory location not the room... oh I didn't chain..
		System.out.println(myHouse.getRoom());
		System.out.println(myHouse.getRoom().getType());
	
	}

}
