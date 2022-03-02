package association.composition4;

public class Room {
	
	// instance variables created
	private String type;
	private String color;
	private boolean closet;
	
	// create a constructor
	public Room(String type, String color, boolean closet) {
		this.type = type;
		this.color = color;
		this.closet = closet;
	}

	//generate getters and setters
	public String getType() {
		return type;
	}

	public void setTypeS(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isCloset() {
		return closet;
	}

	public void setCloset(boolean closet) {
		this.closet = closet;
	}
	
	public String toString() {
		return "The room size is " + this.type + ", the color is " + this.color + ", and does it have a closet?" + " " + this.closet;
	}
	
}
