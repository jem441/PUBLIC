package fixtures;


public class Room extends Fixture {
	
	Room[] exits;

	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
public void setExits(Room w, Room x, Room y, Room z) {
		exits[0] = w;
		exits[1] = x;
		exits[2] = y;
		exits[3] = z;
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room getExit(String direction) {
		switch (direction) {
		case "up":
			return exits[0]; //kitchen
		case "back":
			return exits[1]; //living room
		case "right":
			return exits[2]; //bedroom
		case "left":
			return exits[3]; //bath room
		default:
			System.out.println("Please enter either go: up, back, right or left");
			break;
		}
		return null;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

}
