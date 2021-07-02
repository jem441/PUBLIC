package fixtures;


public class Room extends Fixture {
	
	Room[] exits;

	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
public void setExits(Room v, Room w, Room x, Room y) {
		exits[0] = v;
		exits[1] = w;
		exits[2] = x;
		exits[3] = y;
		//exits[4] = z;
	}
	
	public Room[] getExits() {
		return exits;
	}
	
	public Room getExit(String direction) {
		switch (direction) {
		case "forward":
			return exits[0]; //kitchen
		case "backwards":
			return exits[1]; //living room
		case "right":
			return exits[2]; //bedroom
		case "left":
			return exits[3]; //bath room
		//case "up":
			//return exits[4]; //front hallway
		}
		return null;
	}
	
	public void setExits(Room[] exits) {
		this.exits = exits;
	}

}
