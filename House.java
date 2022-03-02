package association.composition4;

public class House {

	private String design;
	private int yearBuilt;
	private Room room; // this composition creates a strong relationship between Room and House class
	
	//constructor for House
	public House(String design, int yearBuilt, Room room) {
		this.design = design;
		this.yearBuilt = yearBuilt;
		this.room = room;
	}

	// getters and setters generated
	
	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public int getYearBuilt() {
		return yearBuilt;
	}

	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	// This is probably the problem because its getting an object...
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	
	public String toString() {
		//return "My " + this.getDesign() + " house was built in " + this.getYearBuilt() + " and has a room that is " + this.getRoom().getSize(); 
		return "My " + this.getDesign() + " house was built in " + this.getYearBuilt() + " and has a room that is " + this.getRoom().getType();
	}
	
	
}
